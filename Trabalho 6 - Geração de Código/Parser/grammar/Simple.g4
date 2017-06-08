grammar Simple;

target 	: (statement ';' )+ 
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
			;
			
assignment 	: varname=IDENTIFIER '=' exp=expression
			;
			
varDeclaration	: 'int' varname=IDENTIFIER
				;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

NUMBER	: [0-9]+
	  	;			
			
WS
    :   [ \r\t\n]+ -> skip
    ;