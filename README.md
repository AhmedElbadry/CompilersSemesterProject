# Compiler's Semester Project
A compiler of COOL (Classroom Object-Oriented Language) implemented using Java.


## Group 1:
Ahmed Elwy - Salma Sayed - Ahmed El Badry - Remon Fawzy - Khaled Mohamed

## Commands:
You should be in the `COOL Project` directory

To compile the project:

`javac -cp "dep/antlr-4.7.2-complete.jar" src/*.java gen/*.java -d classes`


To run the lexer on an input file good1.cl

`java -cp "classes;dep/antlr-4.7.2-complete.jar" TestLexr good1.cl`

To run the parser on an input file good1.cl

`java -cp "classes;dep/antlr-4.7.2-complete.jar" TestParser good1.cl`

To run the codegenerator on an input file good1.cl

`java -cp "classes;dep/antlr-4.7.2-complete.jar" TestCodegen good1.cl`

## Phase 1 The Lexer:
In this phase, we created a lexical analyzer (scanner) using antlr as lexical analyzer generator.
- In the project's main folder you will find a folder called src which contains a .g4 file in which our lexer grammar is written.
- there is another folder called Test Cases which contains two good .cl files and two bad .cl files, We will test our lexer on these files.
- You will find another folder called Output in which the results of testing the test cases will be put.
- if the test case is good, the result file will contain a list of Cool tokens with the line number and the value of each one.
- if the test case is bad, the result file will contain a list of the valid Cool tokens and the invalid characters each with its line number and its value.
- The last folder called gen which has some generated files and a file called TestLexer.java which contains our implementation of the lexer.

Note: The program takes a single command-line argument which is the test case file name only i.e. you shouldn't type the path just the name of the file (e.g., java TestLexer good1.cl).


## Phase 3: Three Address Code Generation:
The most important part in this phase is to collect the information you need from your source code in order to generate the equivalent three address code for that source code.

There are multiple ways you can get the data you need, you can use Antlr visitors and listeners, or you can use the generated CST from Antlr parsers using Antlr's API. We found it easier to build our AST by writing semantic actions after each rule in the grammar.

This way is actually discussed in the Dragon Book ch2.8.


The format of AST.java

```java
public class AST {
    /*All classes will extend this class*/
    public static class ASTNode {
        int lineNo;
        void gen(){}
    }
    public static class class1 extends ASTNode {...}
    public static class class2 extends ASTNode {...}

    /*
    for the rules that have multiple productions, ex:
    rule:
        production1
        | production2
    ;
    */
    public static class collection1 extends ASTNode {...}
    public static class subclass1_OfCollection1 extends collection1 {...}
    public static class subclass2_OfCollection1 extends collection1 {...}
}
```

There is a class for every rule/operator we want to generate three address code for.

We can use one class for similar operators, for example, an arithematic operator (+, -, *, /) generate similar code, so we can use one class for all arithmetic operators.


This is our parser grammar, for simplicity, we removed all the expressions and only left the arithmetic operations.

```g4
program : programBlocks EOF;

programBlocks: (classDefine SEMICOLON)+ # classes;

classDefine
    : CLASS TYPEID LBRACE featureList RBRACE
    | CLASS TYPEID INHERITS TYPEID LBRACE featureList RBRACE;

featureList: (feature SEMICOLON)*;

feature
    : m=method
    | d=decl
   ;

method returns [AST.method value]
    : OBJECTID LPAREN RPAREN COLON TYPEID LBRACE expression RBRACE
    | OBJECTID LPAREN formalList RPAREN COLON TYPEID LBRACE expression RBRACE
    ;

decl: OBJECTID COLON TYPEID (ASSIGNMENT expression)?;

formalList:formal (COMMA formal)*;

expression
    : expression MULTIPLY expression
    | expression DIVISION expression
    | expression ADD expression
    | expression MINUS expression
    | INT;
```

Here is a simple description of the grammar:

A program contains programBlocks

programBlocks is one or more class

each class has methods and/or declarations

each method contains an expression

each expression is an arithmetic operation or a number.


Creating a class for the program rule
```java
public class AST {
    ...
    public static class program extends ASTNode {
        void gen(){
            System.out.println("program");
        }
    }
}
```

For example, the class will only print `program`.

We should add the semantic action that will create the program node. The rule will be:
```g4
program returns [AST.program value]
    : programBlocks EOF {$value = new AST.program();};
```


This code should be added after the parsing process to run the `gen` function.

```java
CoolParser.ProgramContext prog = parser.program();
prog.value.gen();
```

After running this, you should see the word program printed.

**If you get errors, it might be one of those:**
- Make sure you regenerate Antlr code recognizer each time you modify the grammar.
- Make sure you call `parser.program()` only once, if you generate the CST before, comment the code for it.

Now, we need the information that the `program` has, which is the `programBlocks` (list of classes), and also we should add a new class to represent each class in `programBlocks`, so we modify the AST code as follows:

```java
public class AST {
    ...
    public static class program extends ASTNode {
        public ArrayList<AST.class_> classes_;
        public program(ArrayList<class_> c){
            classes_ = c;
        }
        void gen(){
            System.out.println("program");
            //note: we iterate throgh all classes and call gen on each class
            for ( AST.class_ c: classes_ ) {
                c.gen();
            }
        }
    }

    public static class class_ extends ASTNode {
        void gen(){
            System.out.println("class");
        }
    }
}
```

And in the grammar, we should pass the `programBlocks` to the constructor of the `program` and also create the list of classes on the `programBlocks` rule. Here is the code:

```g4
program returns [AST.program value]
    : pb = programBlocks EOF {$value = new AST.program($pb.value);};

programBlocks returns [ArrayList<AST.class_> value]
    @init
    {$value = new ArrayList<AST.class_>();}
    :(c=classDefine SEMICOLON {$value.add($c.value);})+;
```
If you want to use part of the rule, you can assign it to a variable name ex: `pb = programBlocks`.

After running this, you should get the word `program` printed on the first line and then the word `class` printed on as many lines as the classes in the source file.


This process should be done on all the rules, this is the result for the grammar above.

```g4
program returns [AST.program value]
    : pb = programBlocks EOF{$value = new AST.program($pb.value);};

programBlocks returns [ArrayList<AST.class_> value]
    @init
    {$value = new ArrayList<AST.class_>();}
    : (c = classDefine SEMICOLON {$value.add($c.value);})+;

classDefine returns [AST.class_ value]
    : CLASS TYPEID LBRACE fl=featureList RBRACE
    {$value = new AST.class_($fl.value);}

featureList returns [ArrayList<AST.feature> value]
    @init
    {$value = new ArrayList<AST.feature>();}
    : (f=feature SEMICOLON {$value.add($f.value);})*;

feature returns [AST.feature value]
    : m=method {$value = $m.value;}
    | d=decl {$value = $d.value;};

method returns [AST.method value]
    : OBJECTID LPAREN RPAREN COLON rt=TYPEID LBRACE e=expression RBRACE
    {$value = new AST.method($e.value);};

expression returns [AST.Expression value]:
    e1=expression op=MULTIPLY e2=expression
    {$value = new AST.ArithOp($e1.value, $e2.value, $op.getText());}

    | e1=expression op=DIVISION e2=expression
    {$value = new AST.ArithOp($e1.value, $e2.value, $op.getText());}

    | e1=expression op=ADD e2=expression
    {$value = new AST.ArithOp($e1.value, $e2.value, $op.getText());}

    | e1=expression op=MINUS e2=expression
    {$value = new AST.ArithOp($e1.value, $e2.value, $op.getText());}
```

Note: rules for declarations and formals removed for simpilicity.

The AST.java file should be:

```java
public class AST {
    public static class ASTNode {
        int lineNo;

        void gen(){

        }
    }

    public static ArrayList<String> prog3AdCode = new ArrayList<>();
    public static int tCounter = 1;

    public static class program extends ASTNode {
        public ArrayList<AST.class_> classes_;
        public program(ArrayList<AST.class_> c, int l){
            classes_ = c;
            lineNo = l;
        }
        void gen(){
            for ( AST.class_ c : classes_ ) {
                c.gen();
            }
        }
    }

    public static class class_ extends ASTNode {
        public List<feature> features;
        public class_(List<feature> fl){
            features = fl;
        }
        void gen(){
            for ( feature f : features ) {
                f.gen();
            }
        }
    }

    public static class feature extends ASTNode {
    }

    public static class method extends feature {
        Expression e;
        public method(Expression ee){
            e = ee;
        }
        void gen(){
            e.gen();
        }
    }

    public static class Expression extends ASTNode {
        String type;
        public String v = "uninitialized";
        public Expression(){
            type = "no_type";
        }
        String getV(){
            return v;
        }
    }

    public static class ArithOp extends Expression {
        Expression e1;
        Expression e2;
        String op;
        int res;
        public String v;

        public ArithOp(Expression ee1, Expression ee2, String opp) {
            e1 = ee1;
            e2 = ee2;
            op = opp;
            v = "t" + tCounter++;
        }

        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + op + " " + e2.getV();
            prog3AdCode.add(command);
        }
        @Override
        String getV(){
            return v;
        }
    }

    public static class IntConst extends Expression {
        int value;
        public String v;
        public IntConst(int vv){
            type = "IntConst";
            value = vv;
            this.v = Integer.toString(value);
        }
        @Override
        String getV(){
            return v;
        }
    }
}

```

Similarly, code generation for all other operators is done, by creating a new class for each expression that extends the expression class (like ArithOp class above).