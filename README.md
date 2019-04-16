# Compiler's Semester Project
A compiler of COOL (Classroom Object-Oriented Language) implemented using Java.

## Group 1:
Ahmed Elwy - Salma Sayed - Ahmed El Badry - Remon Fawzy - Khaled Mohamed

### Phase 1 The Lexer:
In this phase we created a lexical analyzer (scanner) using antlr as lexical analyzer generator.
- In the project's main folder you will find a folder called src which contains a .g4 file in which our lexer grammar is written.
- there is another folder called Test Cases which contains two good .cl files and two bad .cl files, We will test our lexer on these files.
- You will find another folder called Output in which the results of testing the test cases will be put.
- if the test case is good, the result file will contain a list of Cool tokens with the line number and the value of each one.
- if the test case is bad, the result file will contain a list of the valid Cool tokens and the invalid characters each with its line number and its value.
- The last folder called gen which have some generated files and a file called TestLexer.java which contains our implementation of the lexer.

Note: The program takes a single command-line argument which is the test case file name only i.e. you should't type the path just the name of the file (e.g.,java TestLexer good1.cl).
