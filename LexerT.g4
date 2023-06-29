lexer grammar LexerT;
BEGIN: 'Xylok';
END: 'Zynd';
SCAN: 'Draxvokzirplor';
PRINT: 'print';
VAR: ([a-z]+ | [A-Z]+);
ENTERO: [0-9]+ ;
DECIMAL: ENTERO '.' ENTERO;
Synt: '=';
Ekval: '==';
Thryp: '*';
Xynth: '/';
Skorn: '-';
Kryst: '+';
SakSak: '++';
Xyrt: 'sin';
Zynt: 'cos';
Tynt: 'tan';
NULL: 'NULL';
PI: '3.1415';
PITUFINUMERO: '1.58';
EULER: '2.71828';

// Definición de espacios en blanco y saltos de línea
WS: [ \t\r\n]+ -> skip;