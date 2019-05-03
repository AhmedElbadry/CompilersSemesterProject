parser grammar Parse;

options {
	tokenVocab = Lex;
}
@header{
	import java.util.List;
}
program returns [AST.program value]
    : pb = programBlocks EOF
    {
		$value = new AST.program($pb.value, $pb.value.get(0).lineNo);
	}
    ;


programBlocks returns [ArrayList<AST.class_> value]
    @init
    {
    	$value = new ArrayList<AST.class_>();
    }
     /*classes*/
    : (c = classDefine SEMICOLON {$value.add($c.value);})+ # classes
   //| EOF  {System.out.println("EOF " + $value.size());}# eof
   ;

classDefine returns [AST.class_ value]
    /*class without inherit*/
    : c=CLASS n=TYPEID LBRACE fl=featureList RBRACE
    {
        $value = new AST.class_($n.getText(), "no_inherirts", $fl.value, $c.getLine());
    }
    /*class with inherit*/
    | c=CLASS n=TYPEID INHERITS p=TYPEID LBRACE fl=featureList RBRACE
    {
        $value = new AST.class_($n.getText(), $p.getText(), $fl.value, $c.getLine());
    }
    ;

featureList returns [ArrayList<AST.feature> value]
    @init
    {
    	$value = new ArrayList<AST.feature>();
    }
    : (f=feature SEMICOLON {$value.add($f.value);})*

    ;
feature returns [AST.feature value]
    : m=method
    {
        $value = $m.value;
    }
    | d=decl
    {
        $value = $d.value;
    }
   ;

method returns [AST.method value]
    /*x(): Int {..}*/
    : n=OBJECTID LPAREN RPAREN COLON rt=TYPEID LBRACE expression RBRACE
    {
        $value = new AST.method($n.getText(), $rt.getText(), new ArrayList<AST.formal>(), $n.getLine());
    }

    /*x(a, b ..): Int {..}*/
    |n=OBJECTID LPAREN fl=formalList RPAREN COLON rt=TYPEID LBRACE expression RBRACE
    {
        $value = new AST.method($n.getText(), $rt.getText(), $fl.value, $n.getLine());
    }
    ;

decl returns [AST.decl value]
    /*x: Int*/
    : n=OBJECTID COLON t=TYPEID
    {
        $value = new AST.decl($n.getText(), $t.getText(), $n.getLine());
    }
    /*x: Int = expr*/
    | n=OBJECTID COLON t=TYPEID (ASSIGNMENT expression)?
    {
        $value = new AST.decl($n.getText(), $t.getText(), $n.getLine());
    }
    ;

formalList returns [ArrayList<AST.formal> value]
    @init
    {
    	$value = new ArrayList<AST.formal>();
    }
    : f=formal {$value.add($f.value);} (COMMA fi=formal {$value.add($fi.value);})*

    ;
formal returns [AST.formal value]
    /*x: Int*/
    : n=OBJECTID COLON t=TYPEID
    {
        $value = new AST.formal($n.getText(), $t.getText());
    }
    ;

/* method argument */
expression

   :
   /*
   expression (ATSYM TYPEID)? DOT OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # methodCall
   | OBJECTID LPAREN (expression (COMMA expression)*)* RPAREN # ownMethodCall
   | IF expression THEN expression ELSE expression FI # if
   | WHILE expression LOOP expression POOL # while
   | LBRACE (expression SEMICOLON) + RBRACE # block
   | LET OBJECTID COLON TYPEID (ASSIGNMENT expression)? (COMMA OBJECTID COLON TYPEID (ASSIGNMENT expression)?)* IN expression # letIn
   | CASE expression OF (OBJECTID COLON TYPEID CASE_ARROW expression SEMICOLON) + ESAC # case
   | NEW TYPEID # new
   | MINUS expression # negative
   | ISVOID expression # isvoid*/

   expression MULTIPLY expression # multiply
   | expression DIVISION expression # division
   | expression ADD expression # add
   | expression MINUS expression # minus
   /*
   | expression LESS_THAN expression # lessThan
   | expression LESS_EQUAL expression # lessEqual
   | expression EQUAL expression # equal
   | NOT expression # boolNot
   | LPAREN expression RPAREN # parentheses
   | OBJECTID # id
   */
   | INT # int
   /*
   | STRING # string
   | BOOL_CONST # TrueOrFlase
   | OBJECTID ASSIGNMENT expression # assignment
   */
   ;