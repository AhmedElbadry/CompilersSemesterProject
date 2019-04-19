parser grammar Parser;

classes:
    class SEMICOLON classes
    | EOF
    ;

class:
    CLASS TYPEID (INHERITS TYPEID)? LBRACE expr RBRACE
    ;

expr:
    INT_CONST PLUS INT_CONST SEMICOLON
    ;


