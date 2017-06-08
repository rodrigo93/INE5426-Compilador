/**
 * Define a grammar called NossaLinguagem
 */
grammar NossaLinguagem;

goal
    :   mainClassDeclaration
        classDeclaration*
    ;

mainClassDeclaration
    :   'class' ID
        mainClassBody
    ;

classDeclaration
    :   'class' ID ('extends' type)?
        classBody
    ;

mainClassBody
    :   '{' mainMethod '}'
    ;

mainMethod
    :   mainMethodDeclaration '{' statement* '}'
    ;

mainMethodDeclaration
    :   'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
    ;

classBody
    :   '{' fieldDeclaration*
            methodDeclaration* '}'
    ;

fieldDeclaration
    :   type varName=ID ';' #fieldDeclare
	|   type varName=ID '=' value=ID ';' #fieldatribuitionID
    |   type varName=ID '=' value=INT ';' #fieldatribuitionInt
    |   type varName=ID '=' value=CHAR ';' #fieldatribuitionChar
    |   type varName=ID '=' value=QUANTUM ';' #fieldatribuitionQuantum
    |   type varName=ID '=' value=BOOL ';' 	#fieldatribuitionBool
    ;

varDeclaration
    :   type varName=ID ';' #declaration
	|   type varName=ID '=' value=ID ';' #atribuitionID
    |   type varName=ID '=' value=INT ';' #atribuitionInt
    |   type varName=ID '=' value=CHAR ';' #atribuitionChar
    |   type varName=ID '=' value=QUANTUM ';' #atribuitionQuantum
    |   type varName=ID '=' value=BOOL ';' 	#atribuitionBool
    ;

methodDeclaration
    :   ( 'public' type ID formalParameters
        /* illegal method declarations */
        |          type ID formalParameters
            {notifyErrorListeners("method declaration without public");}
        | 'public'      ID formalParameters
            {notifyErrorListeners("method declaration without return type");}
        | 'public' type    formalParameters
            {notifyErrorListeners("method declaration without method name");}
        | 'public' type ID
            {notifyErrorListeners("method declaration without argument list");}
        )
        methodBody
    ;

methodBody
    :   '{'
            varDeclaration*
            statement+
        '}'
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ID
    ;

type
    :   intArrayType
    |   booleanType
    |   quantumType
    |   intType
    |	charType
    |   ID
    ;

statement
    :   '{' statement* '}'
    # nestedStatement
    |   'if' '(' booleanExpression ')'
            statement
        'else'
            statement
    # ifElseStatement
    |   'while' '(' booleanExpression ')'
            statement
    # whileStatement
    |   'System.out.println' '(' arg=expression ')' ';'
    # printStatement
    |   'System.out.println' '(' arg=mathExpression ')' ';'
    # printStatement2
    |   'System.out.println' '(' arg=booleanExpression ')' ';'
    # printStatement3
    |   ID '=' expression ';'
    # assignStatement
	|   ID '=' booleanExpression ';'
    # assignStatement2
	|   ID '=' mathExpression ';'
    # assignStatement3
    |   ID '[' expression ']' '=' expression ';'
    # arrayAssignStatement
    |   'return' expression ';'
    # returnStatement
	|   'return' functionCall ';'
    # returnStatement2
    |   'recur' booleanExpression '?' methodArgumentList ':' expression ';'
    # recurStatement
    ;

expression
    :   left=expression '[' right=expression ']'
    # arrayAccessExpression
    |   left=expression '.' 'length'
    # arrayLengthExpression
    |   left=expression '.' ID methodArgumentList
    # methodCallExpression
    |   '-' expression
    # negExpression
    |   'new' 'int' '[' right=expression ']'
    # arrayInstantiationExpression
    |   'new' ID '(' ')'
    # objectInstantiationExpression
    |   left=expression '=' right=expression
    # atrExpression
    |   INT
    # intLitExpression
    |	QUANTUM
    # quantumExpression
    |	CHAR
    # charExpression
    |   BOOL
    # booleanLitExpression
    |   ID
    # identifierExpression
    |   'this'
    # thisExpression
    |   '(' right=expression ')'
    # parenExpression2
    ;

booleanExpression
	:   '!' expression
    # notExpression
    |   left=expression '<'  right=expression
    # ltExpression
	|   left=expression '==' right=expression
	# eqExpression
    |   left=expression '&&' right=expression
    # andExpression
    |	left=expression '||' right=expression
    # andExpression
	|   left=expression '<'  right=booleanExpression
    # ltExpression2
	|   left=expression '==' right=booleanExpression
	# eqExpression2
    |   left=expression '&&' right=booleanExpression
    # andExpression2
    |	left=expression '||' right=booleanExpression
    # andExpression2
	|   '(' right=booleanExpression ')'
    # nestedExpression
	|   right=ID
    # IDExpression
	;

mathExpression
	:   left=expression '+'  right=expression
    # addExpression
    |   left=expression '-'  right=expression
    # subExpression
    |   left=expression '*'  right=expression
    # mulExpression
	|   left=expression '+'  right=mathExpression
    # addExpression2
    |   left=expression '-'  right=mathExpression
    # subExpression2
    |   left=expression '*'  right=mathExpression
    # mulExpression2
	;

functionCall
	: funcID=ID args=methodArgumentList
	;

methodArgumentList
    :   '(' (expression (',' expression)*)? ')'
    ;

intArrayType
    :   'int' '[' ']'
    ;

charType
	:	'char'
	;

booleanType
    :   'boolean'
    ;

intType
    :   'int'
    ;

quantumType
	:	'quantum'
	;

CHAR
	:	'\''[a-zA-Z_]'\''
	;

INT
    :   ('0' | [1-9][0-9]*)
    ;

QUANTUM
	:	'true'
	|	'false'
	|	'maybe'
	;

BOOL
    :   'true'
    |   'false'
    ;

ID
    :   [a-zA-Z_][0-9a-zA-Z_]*
    ;

WS
    :   [ \r\t\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
