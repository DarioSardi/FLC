// $ANTLR 3.5.1 /home/panda/Documenti/lab flc/myProj/riskV.g 2019-01-08 11:44:20

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
		"CMP", "DTYPE", "ERROR", "ID", "INT", "JMP", "MUL", "OR", "ORI", "RTYPE", 
		"STRING", "SUB", "TWODOT", "WS", "XOR", "XORI", "'0x'"
	};
	public static final int EOF=-1;
	public static final int T__24=24;
	public static final int ADD=4;
	public static final int ADDI=5;
	public static final int AND=6;
	public static final int ANDI=7;
	public static final int CMP=8;
	public static final int DTYPE=9;
	public static final int ERROR=10;
	public static final int ID=11;
	public static final int INT=12;
	public static final int JMP=13;
	public static final int MUL=14;
	public static final int OR=15;
	public static final int ORI=16;
	public static final int RTYPE=17;
	public static final int STRING=18;
	public static final int SUB=19;
	public static final int TWODOT=20;
	public static final int WS=21;
	public static final int XOR=22;
	public static final int XORI=23;

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
	@Override public String getGrammarFileName() { return "/home/panda/Documenti/lab flc/myProj/riskV.g"; }


	  
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



	// $ANTLR start "start"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:44:1: start : ( line )* ;
	public final void start() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:44:6: ( ( line )* )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:44:7: ( line )*
			{
			init();
			// /home/panda/Documenti/lab flc/myProj/riskV.g:44:18: ( line )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ADD && LA1_0 <= DTYPE)||LA1_0==ID||(LA1_0 >= JMP && LA1_0 <= ORI)||LA1_0==SUB||(LA1_0 >= XOR && LA1_0 <= XORI)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:44:18: line
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:46:1: line : ( r3Type | r3IType | defineVar | jumpUnc | jumpCond | label );
	public final void line() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:46:5: ( r3Type | r3IType | defineVar | jumpUnc | jumpCond | label )
			int alt2=6;
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
			case JMP:
				{
				alt2=4;
				}
				break;
			case CMP:
				{
				alt2=5;
				}
				break;
			case ID:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:7: r3Type
					{
					pushFollow(FOLLOW_r3Type_in_line61);
					r3Type();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:16: r3IType
					{
					pushFollow(FOLLOW_r3IType_in_line65);
					r3IType();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:26: defineVar
					{
					pushFollow(FOLLOW_defineVar_in_line69);
					defineVar();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:38: jumpUnc
					{
					pushFollow(FOLLOW_jumpUnc_in_line73);
					jumpUnc();
					state._fsp--;

					env.debug("jump");
					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:68: jumpCond
					{
					pushFollow(FOLLOW_jumpCond_in_line78);
					jumpCond();
					state._fsp--;

					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:46:79: label
					{
					pushFollow(FOLLOW_label_in_line82);
					label();
					state._fsp--;

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
	}
	// $ANTLR end "line"



	// $ANTLR start "defineVar"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:49:1: defineVar : type= DTYPE name= STRING value= INT ;
	public final void defineVar() throws RecognitionException {
		Token type=null;
		Token name=null;
		Token value=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:49:11: (type= DTYPE name= STRING value= INT )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:50:2: type= DTYPE name= STRING value= INT
			{
			type=(Token)match(input,DTYPE,FOLLOW_DTYPE_in_defineVar95); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_defineVar99); 
			value=(Token)match(input,INT,FOLLOW_INT_in_defineVar103); 

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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:55:1: reserveVar : type= RTYPE name= STRING ;
	public final void reserveVar() throws RecognitionException {
		Token type=null;
		Token name=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:55:11: (type= RTYPE name= STRING )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:55:13: type= RTYPE name= STRING
			{
			type=(Token)match(input,RTYPE,FOLLOW_RTYPE_in_reserveVar116); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_reserveVar120); 

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



	// $ANTLR start "r3IType"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:60:1: r3IType : op= fI d= register s1= register s2= immediate ;
	public final void r3IType() throws RecognitionException {
		function3I op =null;
		String d =null;
		String s1 =null;
		Variable s2 =null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:60:9: (op= fI d= register s1= register s2= immediate )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:60:11: op= fI d= register s1= register s2= immediate
			{
			pushFollow(FOLLOW_fI_in_r3IType133);
			op=fI();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3IType137);
			d=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3IType141);
			s1=register();
			state._fsp--;

			pushFollow(FOLLOW_immediate_in_r3IType145);
			s2=immediate();
			state._fsp--;


						op.source1=s1;
						op.source2=s2.getValue();
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
	// $ANTLR end "r3IType"



	// $ANTLR start "r3Type"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:69:1: r3Type : op= f3 d= register s1= register s2= register ;
	public final void r3Type() throws RecognitionException {
		function3 op =null;
		String d =null;
		String s1 =null;
		String s2 =null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:69:8: (op= f3 d= register s1= register s2= register )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:69:11: op= f3 d= register s1= register s2= register
			{
			pushFollow(FOLLOW_f3_in_r3Type163);
			op=f3();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type167);
			d=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type171);
			s1=register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_r3Type175);
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:78:1: f3 returns [function3 f] : ( ADD | SUB | MUL | XOR | OR | AND );
	public final function3 f3() throws RecognitionException {
		function3 f = null;


		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:78:25: ( ADD | SUB | MUL | XOR | OR | AND )
			int alt3=6;
			switch ( input.LA(1) ) {
			case ADD:
				{
				alt3=1;
				}
				break;
			case SUB:
				{
				alt3=2;
				}
				break;
			case MUL:
				{
				alt3=3;
				}
				break;
			case XOR:
				{
				alt3=4;
				}
				break;
			case OR:
				{
				alt3=5;
				}
				break;
			case AND:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:79:3: ADD
					{
					match(input,ADD,FOLLOW_ADD_in_f3195); 
					f= new function3("ADD",env);
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:80:3: SUB
					{
					match(input,SUB,FOLLOW_SUB_in_f3202); 
					f= new function3("SUB",env);
					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:81:3: MUL
					{
					match(input,MUL,FOLLOW_MUL_in_f3209); 
					f= new function3("MUL",env);
					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:82:3: XOR
					{
					match(input,XOR,FOLLOW_XOR_in_f3216); 
					f= new function3("XOR",env);
					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:83:3: OR
					{
					match(input,OR,FOLLOW_OR_in_f3223); 
					f= new function3("OR",env);
					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:84:3: AND
					{
					match(input,AND,FOLLOW_AND_in_f3231); 
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:88:1: fI returns [function3I f] : ( ADDI | ANDI | ORI | XORI );
	public final function3I fI() throws RecognitionException {
		function3I f = null;


		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:88:26: ( ADDI | ANDI | ORI | XORI )
			int alt4=4;
			switch ( input.LA(1) ) {
			case ADDI:
				{
				alt4=1;
				}
				break;
			case ANDI:
				{
				alt4=2;
				}
				break;
			case ORI:
				{
				alt4=3;
				}
				break;
			case XORI:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:89:3: ADDI
					{
					match(input,ADDI,FOLLOW_ADDI_in_fI252); 
					f= new function3I("ADDI",env);
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:90:3: ANDI
					{
					match(input,ANDI,FOLLOW_ANDI_in_fI259); 
					f= new function3I("ANDI",env);
					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:91:3: ORI
					{
					match(input,ORI,FOLLOW_ORI_in_fI266); 
					f= new function3I("ORI",env);
					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:92:3: XORI
					{
					match(input,XORI,FOLLOW_XORI_in_fI274); 
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:96:1: register returns [String val] : ( '0x' i= INT | STRING );
	public final String register() throws RecognitionException {
		String val = null;


		Token i=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:96:30: ( '0x' i= INT | STRING )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==24) ) {
				alt5=1;
			}
			else if ( (LA5_0==STRING) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:96:33: '0x' i= INT
					{
					match(input,24,FOLLOW_24_in_register292); 
					i=(Token)match(input,INT,FOLLOW_INT_in_register296); 

								checkRegister(i);
								val =i.getText();
								
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:101:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_register307); 
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



	// $ANTLR start "immediate"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:103:1: immediate returns [Variable v] : ( INT | STRING );
	public final Variable immediate() throws RecognitionException {
		Variable v = null;


		Token STRING1=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:104:2: ( INT | STRING )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
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
					// /home/panda/Documenti/lab flc/myProj/riskV.g:104:4: INT
					{
					match(input,INT,FOLLOW_INT_in_immediate322); 
					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:105:3: STRING
					{
					STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_immediate328); 

								String type=env.checkVariable(STRING1.getText());
								if(type!="ok"){
									env.addError(type);
								}
								else{
									v =env.getVariable(STRING1.getText());
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
		return v;
	}
	// $ANTLR end "immediate"



	// $ANTLR start "jumpCond"
	// /home/panda/Documenti/lab flc/myProj/riskV.g:117:1: jumpCond : c= condition j= jumpUnc ;
	public final void jumpCond() throws RecognitionException {
		Integer j =null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:117:9: (c= condition j= jumpUnc )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:117:11: c= condition j= jumpUnc
			{
			pushFollow(FOLLOW_condition_in_jumpCond343);
			condition();
			state._fsp--;

			pushFollow(FOLLOW_jumpUnc_in_jumpCond347);
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:119:1: condition : CMP register register ;
	public final void condition() throws RecognitionException {
		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:120:2: ( CMP register register )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:120:4: CMP register register
			{
			match(input,CMP,FOLLOW_CMP_in_condition359); 
			pushFollow(FOLLOW_register_in_condition361);
			register();
			state._fsp--;

			pushFollow(FOLLOW_register_in_condition363);
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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:122:1: jumpUnc returns [Integer line] : JMP labellino= ID ;
	public final Integer jumpUnc() throws RecognitionException {
		Integer line = null;


		Token labellino=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:123:2: ( JMP labellino= ID )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:123:4: JMP labellino= ID
			{
			match(input,JMP,FOLLOW_JMP_in_jumpUnc377); 
			labellino=(Token)match(input,ID,FOLLOW_ID_in_jumpUnc381); 

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
	// /home/panda/Documenti/lab flc/myProj/riskV.g:127:1: label : s= ID TWODOT ;
	public final void label() throws RecognitionException {
		Token s=null;

		try {
			// /home/panda/Documenti/lab flc/myProj/riskV.g:127:8: (s= ID TWODOT )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:127:11: s= ID TWODOT
			{
			s=(Token)match(input,ID,FOLLOW_ID_in_label395); 
			match(input,TWODOT,FOLLOW_TWODOT_in_label397); 

					env.addLabel(s);
					env.debug("label");
				
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



	public static final BitSet FOLLOW_line_in_start53 = new BitSet(new long[]{0x0000000000C9EBF2L});
	public static final BitSet FOLLOW_r3Type_in_line61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_r3IType_in_line65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defineVar_in_line69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jumpUnc_in_line73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jumpCond_in_line78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_line82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DTYPE_in_defineVar95 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_STRING_in_defineVar99 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_defineVar103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RTYPE_in_reserveVar116 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_STRING_in_reserveVar120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fI_in_r3IType133 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_r3IType137 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_r3IType141 = new BitSet(new long[]{0x0000000000041000L});
	public static final BitSet FOLLOW_immediate_in_r3IType145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_f3_in_r3Type163 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_r3Type167 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_r3Type171 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_r3Type175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_f3195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_f3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MUL_in_f3209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XOR_in_f3216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_f3223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_f3231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADDI_in_fI252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANDI_in_fI259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORI_in_fI266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XORI_in_fI274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_register292 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_register296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_register307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_immediate322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_immediate328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_jumpCond343 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_jumpUnc_in_jumpCond347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CMP_in_condition359 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_condition361 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_register_in_condition363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JMP_in_jumpUnc377 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_jumpUnc381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_label395 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TWODOT_in_label397 = new BitSet(new long[]{0x0000000000000002L});
}
