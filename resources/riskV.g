grammar riskV;

options {
  k = 1; 
  language = Java;
}

@header{
  package antlrGen;
  import extraClass.*;
  //import java.util.*;
}

@lexer::header{
  package antlrGen;
  import extraClass.*;
}

@members{
  
  Environment env;
  void init () {
    env = new Environment();
  }

  public Environment getEnv () {
    return env;
  }
    
  public Integer parsInt(Token i){
  	return Integer.parseInt(i.getText());
  }
  public boolean checkRegister(Token i){
  if(parsInt(i)>30){ //check if is in range
	env.addError("Lexer error at ["+i.getLine() + 
					":" + i.getCharPositionInLine() +"].Max register value is 30!");
	return false;
	}
	return true;
  
  }
}

start:{init();}  line*;
//function itself
line:	r3Type | r3IType | defineVar | jumpUnc {env.debug("jump");}| jumpCond | label;

//REGISTER TYPE VALUE/REGISTER
defineVar	:	
	type=DTYPE name=STRING value=INT
	{
		env.insertVariable($name,$type.getText(),$value.getText());
	};
	
reserveVar:	type=RTYPE name=STRING
	{
		env.insertVariable($name,$type.getText());
	};

r3IType	:	op=fI d=register s1=register s2=immediate 
		{
			$op.f.source1=$s1.val;
			$op.f.source2=$s2.v.getValue();
			$op.f.destination=$d.val;
			$op.f.print();			
		}
	;

r3Type	: 	op=f3 d=register s1=register s2=register//RD RS RS
		{
			$op.f.source1=$s1.val;
			$op.f.source2=$s2.val;
			$op.f.destination=$d.val;
			$op.f.print();
		}
	;

f3	returns [function3 f]:	
		ADD {f= new function3("ADD",env);}|
		SUB {f= new function3("SUB",env);}|
		MUL {f= new function3("MUL",env);}|
		XOR {f= new function3("XOR",env);}|
		OR  {f= new function3("OR",env);}|
		AND {f= new function3("AND",env);}
		
	;

fI	returns [function3I f]:	
		ADDI {f= new function3I("ADDI",env);}|
		ANDI {f= new function3I("ANDI",env);}|
		ORI  {f= new function3I("ORI",env);}|
		XORI {f= new function3I("XORI",env);}
	; 


register returns [String val]:	 '0x' i=INT 
			{
			checkRegister($i);
			$val=$i.getText();
			}
		|STRING;
		
immediate returns [Variable v]
	:	INT |
		STRING
		{
			String type=env.checkVariable($STRING.getText());
			if(type!="ok"){
				env.addError(type);
			}
			else{
				$v=env.getVariable($STRING.getText());
			}
		}
	;

jumpCond:	c=condition j=jumpUnc  {env.debug("jump to line "+$j.line+" if condition is true");};

condition
	:	CMP register register ;

jumpUnc returns [Integer line]
	:	JMP labellino=ID{
		$line=env.checkLabel($labellino);
	};
	
label 	:	 s=ID TWODOT{
		env.addLabel($s);
		env.debug("label");
	};

TWODOT	:	':';
CMP	:	'CMP';
DTYPE	:	'DB'|'DW';
RTYPE	:	'RESB' | 'RESW';
JMP	:	'JMP' | 'JE'  | 'JZ' | 
		'JNE' | 'JNZ' | 'JG' | 
		'JNLE'| 'JGE' | 'JNG'| 
		'JL'  |'JNGE' | 'JLE';


ADDI	:	'addi'	| 'ADDI';
ANDI	:	'andi'	| 'ANDI';
ORI	:	'ori'	| 'ORI;';
XORI	:	'xori'  | 'XORI'; 
ADD	:	'add' 	| 'ADD';
SUB	:	'sub' 	| 'SUB';
MUL	:	'mul'	| 'MUL';
XOR	:	'xor'	| 'XOR';
OR	:	'or' 	| 'OR';
AND	:	'and' 	| 'AND';
INT	:    	('0'..'9')+;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

STRING	:	('a'..'z')+;    
ID    : (('a'..'z')|('A'..'Z'))  
        ( ('a'..'z')|('A'..'Z')|('0'..'9')|'_')*
      ;
ERROR: .;