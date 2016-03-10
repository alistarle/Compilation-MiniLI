grammar Minili;

minili: (function|global)* EOF  #Program
	;

//Type de base
Int : 'int';
Boolean : 'boolean';
Char : 'char';
Void : 'void';

//Opération type de base
//Arithmetique
ADD : '+';
SUB:  '-';
MUL : '*';
DIV : '/';
//Comparaison
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';
EQ : '==';
NEQ : '!=';
//Logique
AND : '&&';
OR : '||';
NOT : '!';

//Structure de controles
IF : 'if';
ELSE : 'else';
WHILE : 'while';
GLOBAL : 'global';

//Function
RETURN : 'return';

type : Int
    | Boolean
    | Char
    | Void
    ;


global : GLOBAL affectation ';';

affectation : type Identifiant'['(Constante|Identifiant)']' #DeclareTab
    | Identifiant'['expression']' '=' expression #AssignTabExp
    | type? Identifiant '=' SUB?expression # AssignExp
    | type Identifiant #DeclareVar
    ;

function : type Identifiant'(' ('&'?type Identifiant)?(','+('&'?type Identifiant)+)* ')' '{' (instruction)* ret? '}';

functionCall: ((affectation|Identifiant) '=')? Identifiant'(' ('&'? expression)?(','+('&'? expression)+)* ')';

instruction : affectation ';'
    | functionCall ';'
    | controle
    | ret
    ;

ret: RETURN expression ';' #ReturnExp
    | RETURN #ReturnOnly
    ;

instructionList: (instruction)*
    ;

controle : IF '(' expression ')' '{' instructionList '}' (ELSE '{' instructionList '}')? #ControleIf
    | WHILE '(' expression ')' '{' (instruction)* '}' #ControleWhile
    ;

expression : expression op=(MUL|DIV) expression #MulDiv
	| expression op=(ADD|SUB) expression #AddSub
	| expression op=(GT|GTE|LT|LTE) expression #Comp
	| expression op=(EQ|NEQ) expression #Equal
	| expression op=(AND|OR) expression #Logic
	| op=NOT expression                  #LogicNot
	| Identifiant						 #Id
	| Identifiant'['expression']'        #IdArray
	| BOOLEAN                            #Boolean
	| CHAR                               #Char
	| SUB?Constante                      #Int
	| '('expression')'					 #Par
	| functionCall                      #ExpFunctionCall
	;

Constante : [0-9]+;

Identifiant : [a-zA-Z0-9]+;

BOOLEAN : 'true'|'false';

CHAR : '\''[a-zA-Z ]+'\'';

WS : [ \t\r\n\l]+ -> skip;