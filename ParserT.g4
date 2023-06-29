grammar ParserT;
import LexerT;

program   : BEGIN  desarrollo+ END;
pasos: (print | leer);
leer: SCAN '(' ')';
var: VAR;
print: PRINT (var|num);

incremento: var SakSak;
entero:  ENTERO;
decimal: DECIMAL;
num: (entero| decimal);

constantes: (num | var);
multiplicacion: var Synt  (num | var) Thryp (num | var);
division: var Synt (num | var) Xynth (num | var);
suma: var Synt var Kryst var;
resta: var Synt (num | var) Skorn (num | var);
para: 'Krodf' '(' vardc ';' logica ';' incremento ')' '{' (desarrollo)+ '}';
si: 'Bik' '(' var operador (var|num) ')''{'(desarrollo)+'}';
mientras: 'Kylef' '('logica')''{'(desarrollo)+'}';
logica: (var  ('Mayoht' | 'Menhok') num);
operacion:  multiplicacion | division| suma | resta|si|mientras|para|logica | incremento;
operador: (logica | Ekval);
vardc: (var Synt num);
desarrollo: (operacion | pasos | vardc);
sin: 'Xyrt''('var|num')';
cos: 'Zynt''('var|num')';
tan: 'Tynt''('var|num')';


