// $ANTLR 3.5.1 /home/panda/Documenti/lab flc/RiskV/resources/riskV.g 2019-03-13 23:32:45

  package antlrGen;
  import extraClass.*;
  //import java.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class riskVParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADDI", "AND", "ANDI", 
		"CMP", "DTYPE", "ERROR", "INT", "JMP", "MUL", "OR", "ORI", "RTYPE", "STRING", 
		"SUB", "SUBI", "TWODOT", "VTYPE", "WS", "XOR", "XORI", "'0x'", "'\\n'"
	};
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int ADD=4;
	public static final int ADDI=5;
	public static final int AND=6;
	public static final int ANDI=7;
	public static final int CMP=8;
	public static final int DTYPE=9;
	public static final int ERROR=10;
	public static final int INT=11;
	public static final int JMP=12;
	public static final int MUL=13;
	public static final int OR=14;
	public static final int ORI=15;
	public static final int RTYPE=16;
	public static final int STRING=17;
	public static final int SUB=18;
	public static final int SUBI=19;
	public static final int TWODOT=20;
	public static final int VTYPE=21;
	public static final int WS=22;
	public static final int XOR=23;
	public static final int XORI=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public riskVParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public riskVParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return riskVParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/panda/Documenti/lab flc/RiskV/resources/riskV.g"; }


	  
	  Environment env;
	  void init () {
	    env = new Environment();
	  }

	  public Environment getEnv () {
	    return env;
	  }
	    
	  public Integer parseInt(Token i){
	  	return Integer.parseInt(i.getText());
	  }
	  public boolean checkRegister(Token i){
	  if(parseInt(i)>30){ //check if is in range
		env.addError("Lexer error at ["+i.getLine() + 
						":" + i.getCharPositionInLine() +"].Max register value is 30!");
		return false;
		}
		return true;
	  
	  }



	// $ANTLR start "start"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:44:1: start : ( line )* ;
	public final void start() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:44:6: ( ( line )* )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:44:7: ( line )*
			{
			init();
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:44:18: ( line )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ADD && LA1_0 <= ERROR)||(LA1_0 >= JMP && LA1_0 <= SUBI)||LA1_0==VTYPE||(LA1_0 >= XOR && LA1_0 <= XORI)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:44:18: line
					{
					pushFollow(FOLLOW_line_in_start53);
					line();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "line"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:1: line : ( r3Type | r3IType | defineVar | reserveVar | defineRegister | jumpUnc | jumpCond | label | ERROR ) '\\n' ;
	public final void line() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:5: ( ( r3Type | r3IType | defineVar | reserveVar | defineRegister | jumpUnc | jumpCond | label | ERROR ) '\\n' )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:7: ( r3Type | r3IType | defineVar | reserveVar | defineRegister | jumpUnc | jumpCond | label | ERROR ) '\\n'
			{
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:7: ( r3Type | r3IType | defineVar | reserveVar | defineRegister | jumpUnc | jumpCond | label | ERROR )
			int alt2=9;
			switch ( input.LA(1) ) {
			case ADD:
			case AND:
			case MUL:
			case OR:
			case SUB:
			case XOR:
				{
				alt2=1;
				}
				break;
			case ADDI:
			case ANDI:
			case ORI:
			case SUBI:
			case XORI:
				{
				alt2=2;
				}
				break;
			case DTYPE:
				{
				alt2=3;
				}
				break;
			case VTYPE:
				{
				alt2=4;
				}
				break;
			case RTYPE:
				{
				alt2=5;
				}
				break;
			case JMP:
				{
				alt2=6;
				}
				break;
			case CMP:
				{
				alt2=7;
				}
				break;
			case STRING:
				{
				alt2=8;
				}
				break;
			case ERROR:
				{
				alt2=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:8: r3Type
					{
					pushFollow(FOLLOW_r3Type_in_line62);
					r3Type();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:17: r3IType
					{
					pushFollow(FOLLOW_r3IType_in_line66);
					r3IType();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:27: defineVar
					{
					pushFollow(FOLLOW_defineVar_in_line70);
					defineVar();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:38: reserveVar
					{
					pushFollow(FOLLOW_reserveVar_in_line73);
					reserveVar();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:50: defineRegister
					{
					pushFollow(FOLLOW_defineRegister_in_line76);
					defineRegister();
					state._fsp--;

					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:67: jumpUnc
					{
					pushFollow(FOLLOW_jumpUnc_in_line80);
					jumpUnc();
					state._fsp--;

					env.debug("jump");
					}
					break;
				case 7 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:98: jumpCond
					{
					pushFollow(FOLLOW_jumpCond_in_line86);
					jumpCond();
					state._fsp--;

					}
					break;
				case 8 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:109: label
					{
					pushFollow(FOLLOW_label_in_line90);
					label();
					state._fsp--;

					}
					break;
				case 9 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:46:117: ERROR
					{
					match(input,ERROR,FOLLOW_ERROR_in_line94); 
					}
					break;

			}

			match(input,26,FOLLOW_26_in_line97); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "line"



	// $ANTLR start "defineVar"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:49:1: defineVar : type= DTYPE name= STRING value= INT ;
	public final void defineVar() throws RecognitionException {
		Token type=null;
		Token name=null;
		Token value=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:49:11: (type= DTYPE name= STRING value= INT )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:50:3: type= DTYPE name= STRING value= INT
			{
			type=(Token)match(input,DTYPE,FOLLOW_DTYPE_in_defineVar111); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_defineVar115); 
			value=(Token)match(input,INT,FOLLOW_INT_in_defineVar119); 

					env.insertVariable(name,type.getText(),value.getText());
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "defineVar"



	// $ANTLR start "reserveVar"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:55:1: reserveVar : type= VTYPE name= STRING ;
	public final void reserveVar() throws RecognitionException {
		Token type=null;
		Token name=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:55:11: (type= VTYPE name= STRING )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:55:13: type= VTYPE name= STRING
			{
			type=(Token)match(input,VTYPE,FOLLOW_VTYPE_in_reserveVar132); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_reserveVar136); 

					env.insertVariable(name,type.getText());
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "reserveVar"



	// $ANTLR start "defineRegister"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:59:1: defineRegister : type= RTYPE name= STRING value= register ;
	public final void defineRegister() throws RecognitionException {
		Token type=null;
		Token name=null;
		String value =null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:60:2: (type= RTYPE name= STRING value= register )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:60:4: type= RTYPE name= STRING value= register
			{
			type=(Token)match(input,RTYPE,FOLLOW_RTYPE_in_defineRegister149); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_defineRegister153); 
			pushFollow(FOLLOW_register_in_defineRegister157);
			value=register();
			state._fsp--;


					env.insertVariable(name,type.getText(),value);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "defineRegister"



	// $ANTLR start "r3IType"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:66:1: r3IType : op= fI d= register s1= register (s2v= immediateVar |s2= INT ) ;
	public final void r3IType() throws RecognitionException {
		Token s2=null;
		function3I op =null;
		String d =null;
		String s1 =null;
		Variable s2v =null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:66:9: (op= fI d= register s1= register (s2v= immediateVar |s2= INT ) )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:66:11: op= fI d= register s1= register (s2v= immediateVar |s2= INT )
			{
			pushFollow(FOLLOW_fI_in_r3IType172);
			op=fI();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3IType176);
			d=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3IType180);
			s1=register();
			state._fsp--;

			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:67:3: (s2v= immediateVar |s2= INT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STRING) ) {
				alt3=1;
			}
			else if ( (LA3_0==INT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:68:4: s2v= immediateVar
					{
					pushFollow(FOLLOW_immediateVar_in_r3IType192);
					s2v=immediateVar();
					state._fsp--;


											op.source2=s2v.getValue();
											op.source1=s1;
											op.destination=d;
											op.print();	
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:74:4: s2= INT
					{
					s2=(Token)match(input,INT,FOLLOW_INT_in_r3IType207); 

											Long i=Long.parseLong(s2.getText());
											if(i<4096){
												op.source2=i;}
											else {
												op.source2=Integer.toUnsignedLong(0);
												env.addError("at line "+(s2!=null?s2.getLine():0)+" value too big, setted to 0");
											}
											op.source1=s1;
											op.destination=d;
											op.print();	
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "r3IType"



	// $ANTLR start "r3Type"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:89:1: r3Type : op= f3 d= register s1= register s2= register ;
	public final void r3Type() throws RecognitionException {
		function3 op =null;
		String d =null;
		String s1 =null;
		String s2 =null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:89:8: (op= f3 d= register s1= register s2= register )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:89:11: op= f3 d= register s1= register s2= register
			{
			pushFollow(FOLLOW_f3_in_r3Type232);
			op=f3();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type236);
			d=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type240);
			s1=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type244);
			s2=register();
			state._fsp--;


						op.source1=s1;
						op.source2=s2;
						op.destination=d;
						op.print();
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "r3Type"



	// $ANTLR start "f3"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:98:1: f3 returns [function3 f] : ( ADD | SUB | MUL | XOR | OR | AND );
	public final function3 f3() throws RecognitionException {
		function3 f = null;


		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:98:25: ( ADD | SUB | MUL | XOR | OR | AND )
			int alt4=6;
			switch ( input.LA(1) ) {
			case ADD:
				{
				alt4=1;
				}
				break;
			case SUB:
				{
				alt4=2;
				}
				break;
			case MUL:
				{
				alt4=3;
				}
				break;
			case XOR:
				{
				alt4=4;
				}
				break;
			case OR:
				{
				alt4=5;
				}
				break;
			case AND:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:99:3: ADD
					{
					match(input,ADD,FOLLOW_ADD_in_f3264); 
					f= new function3("ADD",env);
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:100:3: SUB
					{
					match(input,SUB,FOLLOW_SUB_in_f3271); 
					f= new function3("SUB",env);
					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:101:3: MUL
					{
					match(input,MUL,FOLLOW_MUL_in_f3278); 
					f= new function3("MUL",env);
					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:102:3: XOR
					{
					match(input,XOR,FOLLOW_XOR_in_f3285); 
					f= new function3("XOR",env);
					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:103:3: OR
					{
					match(input,OR,FOLLOW_OR_in_f3292); 
					f= new function3("OR",env);
					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:104:3: AND
					{
					match(input,AND,FOLLOW_AND_in_f3300); 
					f= new function3("AND",env);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "f3"



	// $ANTLR start "fI"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:108:1: fI returns [function3I f] : ( ADDI | ANDI | ORI | SUBI | XORI );
	public final function3I fI() throws RecognitionException {
		function3I f = null;


		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:108:26: ( ADDI | ANDI | ORI | SUBI | XORI )
			int alt5=5;
			switch ( input.LA(1) ) {
			case ADDI:
				{
				alt5=1;
				}
				break;
			case ANDI:
				{
				alt5=2;
				}
				break;
			case ORI:
				{
				alt5=3;
				}
				break;
			case SUBI:
				{
				alt5=4;
				}
				break;
			case XORI:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:109:3: ADDI
					{
					match(input,ADDI,FOLLOW_ADDI_in_fI321); 
					f= new function3I("ADDI",env);
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:110:3: ANDI
					{
					match(input,ANDI,FOLLOW_ANDI_in_fI328); 
					f= new function3I("ANDI",env);
					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:111:3: ORI
					{
					match(input,ORI,FOLLOW_ORI_in_fI335); 
					f= new function3I("ORI",env);
					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:112:3: SUBI
					{
					match(input,SUBI,FOLLOW_SUBI_in_fI343); 
					f= new function3I("SUBI",env);
					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:113:3: XORI
					{
					match(input,XORI,FOLLOW_XORI_in_fI350); 
					f= new function3I("XORI",env);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "fI"



	// $ANTLR start "register"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:118:1: register returns [String val] : ( '0x' i= INT |s= STRING );
	public final String register() throws RecognitionException {
		String val = null;


		Token i=null;
		Token s=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:118:30: ( '0x' i= INT |s= STRING )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==25) ) {
				alt6=1;
			}
			else if ( (LA6_0==STRING) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:118:33: '0x' i= INT
					{
					match(input,25,FOLLOW_25_in_register371); 
					i=(Token)match(input,INT,FOLLOW_INT_in_register375); 

								checkRegister(i);
								val =i.getText();
								
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:123:4: s= STRING
					{
					s=(Token)match(input,STRING,FOLLOW_STRING_in_register388); 

								String type=env.checkVariable(s.getText());
								if(type=="Register"){
									val =String.valueOf(env.getVariable(s.getText()).getRegister());
							}
								else if(type=="Word" || type=="Byte" || type=="Double"){
									env.addError("at line "+(s!=null?s.getLine():0)+" using a non register variable");
								}
								else{
									env.addError(type);
								}
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "register"



	// $ANTLR start "immediateVar"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:136:1: immediateVar returns [Variable v] : STRING ;
	public final Variable immediateVar() throws RecognitionException {
		Variable v = null;


		Token STRING1=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:137:2: ( STRING )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:137:4: STRING
			{
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_immediateVar404); 

						String type=env.checkVariable(STRING1.getText());
						if(type!="ok"){
							env.addError(type);
						}
						else{
							v =env.getVariable(STRING1.getText());
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "immediateVar"



	// $ANTLR start "jumpCond"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:149:1: jumpCond : c= condition '\\n' j= jumpUnc ;
	public final void jumpCond() throws RecognitionException {
		Integer j =null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:149:9: (c= condition '\\n' j= jumpUnc )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:149:11: c= condition '\\n' j= jumpUnc
			{
			pushFollow(FOLLOW_condition_in_jumpCond419);
			condition();
			state._fsp--;

			match(input,26,FOLLOW_26_in_jumpCond421); 
			pushFollow(FOLLOW_jumpUnc_in_jumpCond425);
			j=jumpUnc();
			state._fsp--;

			env.debug("jump to line "+j+" if condition is true");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "jumpCond"



	// $ANTLR start "condition"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:151:1: condition : CMP register register ;
	public final void condition() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:152:2: ( CMP register register )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:152:4: CMP register register
			{
			match(input,CMP,FOLLOW_CMP_in_condition437); 
			pushFollow(FOLLOW_register_in_condition439);
			register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_condition441);
			register();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition"



	// $ANTLR start "jumpUnc"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:154:1: jumpUnc returns [Integer line] : JMP labellino= STRING ;
	public final Integer jumpUnc() throws RecognitionException {
		Integer line = null;


		Token labellino=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:155:2: ( JMP labellino= STRING )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:155:4: JMP labellino= STRING
			{
			match(input,JMP,FOLLOW_JMP_in_jumpUnc455); 
			labellino=(Token)match(input,STRING,FOLLOW_STRING_in_jumpUnc459); 

					line =env.checkLabel(labellino);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return line;
	}
	// $ANTLR end "jumpUnc"



	// $ANTLR start "label"
	// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:159:1: label : s= STRING TWODOT ;
	public final void label() throws RecognitionException {
		Token s=null;

		try {
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:159:8: (s= STRING TWODOT )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:159:11: s= STRING TWODOT
			{
			s=(Token)match(input,STRING,FOLLOW_STRING_in_label473); 
			match(input,TWODOT,FOLLOW_TWODOT_in_label475); 

					env.addLabel(s);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label"

	// Delegated rules



	public static final BitSet FOLLOW_line_in_start53 = new BitSet(new long[]{0x0000000001AFF7F2L});
	public static final BitSet FOLLOW_r3Type_in_line62 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_r3IType_in_line66 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_defineVar_in_line70 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_reserveVar_in_line73 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_defineRegister_in_line76 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_jumpUnc_in_line80 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_jumpCond_in_line86 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_label_in_line90 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ERROR_in_line94 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DTYPE_in_defineVar111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_defineVar115 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_defineVar119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VTYPE_in_reserveVar132 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_reserveVar136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RTYPE_in_defineRegister149 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_defineRegister153 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_defineRegister157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fI_in_r3IType172 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_r3IType176 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_r3IType180 = new BitSet(new long[]{0x0000000000020800L});
	public static final BitSet FOLLOW_immediateVar_in_r3IType192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_r3IType207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_f3_in_r3Type232 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_r3Type236 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_r3Type240 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_r3Type244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_f3264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_f3271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MUL_in_f3278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XOR_in_f3285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_f3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_f3300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADDI_in_fI321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANDI_in_fI328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORI_in_fI335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBI_in_fI343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XORI_in_fI350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_register371 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_register375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_register388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_immediateVar404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_jumpCond419 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_jumpCond421 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_jumpUnc_in_jumpCond425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CMP_in_condition437 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_condition439 = new BitSet(new long[]{0x0000000002020000L});
	public static final BitSet FOLLOW_register_in_condition441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JMP_in_jumpUnc455 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_jumpUnc459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_label473 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TWODOT_in_label475 = new BitSet(new long[]{0x0000000000000002L});
}
