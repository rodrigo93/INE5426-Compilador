grammar Simple;

target 	: programPart+ 
		;
		
programPart	: statement ';' 	#mainStatement
			| methodDeclaration	#programPartDefinitionMethod
			;

println	: 'println(' args=expression  ')'
		;

statement	: println 
			| varDeclaration
			| assignment
			;

expression  : left=expression '*' right=expression 	#mul
			| left=expression '/' right=expression 	#div
			| left=expression '+' right=expression 	#add
			| left=expression '-' right=expression 	#min
			| number=NUMBER  						#num
			| var=IDENTIFIER 						#var		
			| func=methodCall						#functionCall			
			;
			
assignment 	: varname=IDENTIFIER '=' exp=expression
			;
			
			
methodDeclaration	: 'int' methodname=IDENTIFIER '(' vars=varList ')' body=methodbody
					;
					
varList	: declarations+=varDeclaration (',' declarations+=varDeclaration)*
		|
		;
					
methodbody	: '{' body=statementList 'return' ret=expression ';' '}'
			;
			
statementList	: (statement ';')*
				;
			
methodCall	: methodname=IDENTIFIER '(' params=callList ')'
			;
			
callList	: expr+=expression (',' expr+=expression)*
			|
			;
			
varDeclaration	: 'int' varname=IDENTIFIER
				;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

NUMBER	: [0-9]+
	  	;			
			
WS
    :   [ \r\t\n]+ -> skip
    ;