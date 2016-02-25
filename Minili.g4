grammar Minili;

minili: iinstruction* EOF  #Program
	;


iinstruction : function
                | global;

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

affectation : type Identifiant'['Constante']'
    | Identifiant'['Constante']' '=' expression
    | type? Identifiant '=' SUB?expression
    | type Identifiant
    ;

function : type Identifiant'(' ('&'?type Identifiant)?(','+('&'?type Identifiant)+)* ')' '{' (instruction)* ret? '}';

functionCall: ((affectation|Identifiant) '=')? Identifiant'(' ('&'? expression)?(','+('&'? expression)+)* ')';

instruction : affectation ';' #Assign
    | functionCall ';' #FunctionCalll
    | controle #Control
    | ret #retour
    ;

ret: RETURN expression ';'
    | RETURN functionCall
    ;

controle : IF '(' expression ')' '{' (instruction)* '}' (ELSE '{' (instruction)* '}')?
    | WHILE '(' expression ')' '{' (instruction)* '}'
    ;

expression : expression op=(MUL|DIV) expression #MulDiv
	| expression op=(ADD|SUB) expression #AddSub
	| expression op=(GT|GTE|LT|LTE) expression #Comp
	| expression op=(EQ|NEQ) expression #Equal
	| expression op=(AND|OR) expression #Logic
	| op=NOT expression                  #LogicNot
	| Identifiant						 #Id
	| Identifiant'['Constante']'         #IdArray
	| BOOLEAN                            #Boolean
	| CHAR                               #Char
	| SUB?Constante                          #Int
	| '('expression')'					 #Par
	| functionCall                      #ExpFunctionCall
	;

Constante : [0-9]+;

Identifiant : [a-zA-Z0-9]+;

BOOLEAN : 'true'|'false';

CHAR : '\''[a-z]'\'';

WS : [ \t\r\n\l]+ -> skip;