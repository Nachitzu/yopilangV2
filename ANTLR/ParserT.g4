grammar ParserT;
import LexerT;

program: BEGIN statement+ END;
          
statement: print | suma | vardeclaration | if_st;

if_st: IF L_PAR BOOL R_PAR L_CUR statement+ R_CUR;

suma: VARNAME EQUAL ( INT | FLOAT | VARNAME ) PLUS ( INT | FLOAT | VARNAME ) ;

vardeclaration: VARNAME EQUAL ( INT | FLOAT );

print: PRINT L_PAR (INT | FLOAT | VARNAME) R_PAR;
