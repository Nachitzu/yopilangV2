lexer grammar LexerT;

BEGIN: 'begin';
END: 'end';
PRINT: 'print';
PLUS: '+'; 
EQUAL: '=';
L_PAR: '(' ;
R_PAR: ')' ;
L_CUR: '{' ;
R_CUR: '}' ;
IF: 'if' ;

INT : [0-9]+ ;
FLOAT : INT '.' INT;
BOOL : 'True' | 'False' ;
VARNAME: [a-z]+;
WS : [ \t\r\n]+ -> skip ;
