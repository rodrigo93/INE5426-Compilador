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
    :   mainMethodDeclaration '{' statement '}'
    ;

mainMethodDeclaration
    :   'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
    ;

classBody
    :   '{' fieldDeclaration*
            methodDeclaration* '}'
    ;

fieldDeclaration
    :   type ID ';'
	|   type ID '=' ID ';'
    |   type ID '=' INT ';'
    |   type ID '=' CHAR ';'
    |   type ID '=' QUANTUM ';'
    |   type ID '=' BOOL ';' 
    ;

varDeclaration
    :   type ID ';'
    |   type ID '=' ID ';'
    |   type ID '=' INT ';'
    |   type ID '=' CHAR ';'
    |   type ID '=' QUANTUM ';'
    |   type ID '=' BOOL ';' 
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
    |	'if' '(' booleanExpression ')'
	    statement
    # ifStatement
    |   'while' '(' booleanExpression ')'
            statement
    # whileStatement
    |   'System.out.println' '(' expression ')' ';'
    # printStatement
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
    :   expression '[' expression ']'
    # arrayAccessExpression
    |   expression '.' 'length'
    # arrayLengthExpression
    |   expression '.' ID methodArgumentList
    # methodCallExpression
    |   '-' expression
    # negExpression
    |   'new' 'int' '[' expression ']'
    # arrayInstantiationExpression
    |   'new' ID '(' ')'
    # objectInstantiationExpression
    |   expression '=' expression
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
    |   '(' expression ')'
    # parenExpression2
    ;

booleanExpression
	:   '!' expression
    # notExpression
    |   expression '<'  expression
    # ltExpression
	|   expression '==' expression
	# eqExpression
    |   expression '&&' expression
    # andExpression
    |	expression '||' expression
    # andExpression
	|   expression '<'  booleanExpression
    # ltExpression2
	|   expression '==' booleanExpression
	# eqExpression2
    |   expression '&&' booleanExpression
    # andExpression2
    |	expression '||' booleanExpression
    # andExpression2
	|   '(' booleanExpression ')'
    # parenExpression
	|   ID
    # IDExpression
	;

mathExpression
	:   expression '+'  expression
    # addExpression
    |   expression '-'  expression
    # subExpression
    |   expression '*'  expression
    # mulExpression
	|   expression '+'  mathExpression
    # addExpression2
    |   expression '-'  mathExpression
    # subExpression2
    |   expression '*'  mathExpression
    # mulExpression2
	;

functionCall
	: ID methodArgumentList
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
