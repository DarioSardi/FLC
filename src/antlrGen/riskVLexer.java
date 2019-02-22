// $ANTLR 3.5.1 /home/panda/Documenti/lab flc/myProj/riskV.g 2019-01-08 11:44:20

  package antlrGen;
  import extraClass.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class riskVLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public riskVLexer() {} 
	public riskVLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public riskVLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/panda/Documenti/lab flc/myProj/riskV.g"; }

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:12:7: ( '0x' )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:12:9: '0x'
			{
			match("0x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "TWODOT"
	public final void mTWODOT() throws RecognitionException {
		try {
			int _type = TWODOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:132:8: ( ':' )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:132:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWODOT"

	// $ANTLR start "CMP"
	public final void mCMP() throws RecognitionException {
		try {
			int _type = CMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:133:5: ( 'CMP' )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:133:7: 'CMP'
			{
			match("CMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CMP"

	// $ANTLR start "DTYPE"
	public final void mDTYPE() throws RecognitionException {
		try {
			int _type = DTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:134:7: ( 'DB' | 'DW' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='D') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='B') ) {
					alt1=1;
				}
				else if ( (LA1_1=='W') ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:134:9: 'DB'
					{
					match("DB"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:134:14: 'DW'
					{
					match("DW"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DTYPE"

	// $ANTLR start "RTYPE"
	public final void mRTYPE() throws RecognitionException {
		try {
			int _type = RTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:135:7: ( 'RESB' | 'RESW' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='R') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='E') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='S') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='B') ) {
							alt2=1;
						}
						else if ( (LA2_3=='W') ) {
							alt2=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:135:9: 'RESB'
					{
					match("RESB"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:135:18: 'RESW'
					{
					match("RESW"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RTYPE"

	// $ANTLR start "JMP"
	public final void mJMP() throws RecognitionException {
		try {
			int _type = JMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:136:5: ( 'JMP' | 'JE' | 'JZ' | 'JNE' | 'JNZ' | 'JG' | 'JNLE' | 'JGE' | 'JNG' | 'JL' | 'JNGE' | 'JLE' )
			int alt3=12;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='J') ) {
				switch ( input.LA(2) ) {
				case 'M':
					{
					alt3=1;
					}
					break;
				case 'E':
					{
					alt3=2;
					}
					break;
				case 'Z':
					{
					alt3=3;
					}
					break;
				case 'N':
					{
					switch ( input.LA(3) ) {
					case 'E':
						{
						alt3=4;
						}
						break;
					case 'Z':
						{
						alt3=5;
						}
						break;
					case 'L':
						{
						alt3=7;
						}
						break;
					case 'G':
						{
						int LA3_11 = input.LA(4);
						if ( (LA3_11=='E') ) {
							alt3=11;
						}

						else {
							alt3=9;
						}

						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'G':
					{
					int LA3_6 = input.LA(3);
					if ( (LA3_6=='E') ) {
						alt3=8;
					}

					else {
						alt3=6;
					}

					}
					break;
				case 'L':
					{
					int LA3_7 = input.LA(3);
					if ( (LA3_7=='E') ) {
						alt3=12;
					}

					else {
						alt3=10;
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:136:7: 'JMP'
					{
					match("JMP"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:136:15: 'JE'
					{
					match("JE"); 

					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:136:23: 'JZ'
					{
					match("JZ"); 

					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:137:3: 'JNE'
					{
					match("JNE"); 

					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:137:11: 'JNZ'
					{
					match("JNZ"); 

					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:137:19: 'JG'
					{
					match("JG"); 

					}
					break;
				case 7 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:138:3: 'JNLE'
					{
					match("JNLE"); 

					}
					break;
				case 8 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:138:11: 'JGE'
					{
					match("JGE"); 

					}
					break;
				case 9 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:138:19: 'JNG'
					{
					match("JNG"); 

					}
					break;
				case 10 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:139:3: 'JL'
					{
					match("JL"); 

					}
					break;
				case 11 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:139:10: 'JNGE'
					{
					match("JNGE"); 

					}
					break;
				case 12 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:139:19: 'JLE'
					{
					match("JLE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JMP"

	// $ANTLR start "ADDI"
	public final void mADDI() throws RecognitionException {
		try {
			int _type = ADDI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:142:6: ( 'addi' | 'ADDI' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='a') ) {
				alt4=1;
			}
			else if ( (LA4_0=='A') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:142:8: 'addi'
					{
					match("addi"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:142:17: 'ADDI'
					{
					match("ADDI"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDI"

	// $ANTLR start "ANDI"
	public final void mANDI() throws RecognitionException {
		try {
			int _type = ANDI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:143:6: ( 'andi' | 'ANDI' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='a') ) {
				alt5=1;
			}
			else if ( (LA5_0=='A') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:143:8: 'andi'
					{
					match("andi"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:143:17: 'ANDI'
					{
					match("ANDI"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDI"

	// $ANTLR start "ORI"
	public final void mORI() throws RecognitionException {
		try {
			int _type = ORI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:144:5: ( 'ori' | 'ORI;' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='o') ) {
				alt6=1;
			}
			else if ( (LA6_0=='O') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:144:7: 'ori'
					{
					match("ori"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:144:15: 'ORI;'
					{
					match("ORI;"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORI"

	// $ANTLR start "XORI"
	public final void mXORI() throws RecognitionException {
		try {
			int _type = XORI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:145:6: ( 'xori' | 'XORI' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='x') ) {
				alt7=1;
			}
			else if ( (LA7_0=='X') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:145:8: 'xori'
					{
					match("xori"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:145:18: 'XORI'
					{
					match("XORI"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XORI"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:146:5: ( 'add' | 'ADD' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='a') ) {
				alt8=1;
			}
			else if ( (LA8_0=='A') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:146:7: 'add'
					{
					match("add"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:146:16: 'ADD'
					{
					match("ADD"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:147:5: ( 'sub' | 'SUB' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='s') ) {
				alt9=1;
			}
			else if ( (LA9_0=='S') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:147:7: 'sub'
					{
					match("sub"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:147:16: 'SUB'
					{
					match("SUB"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:148:5: ( 'mul' | 'MUL' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='m') ) {
				alt10=1;
			}
			else if ( (LA10_0=='M') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:148:7: 'mul'
					{
					match("mul"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:148:15: 'MUL'
					{
					match("MUL"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:149:5: ( 'xor' | 'XOR' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='x') ) {
				alt11=1;
			}
			else if ( (LA11_0=='X') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:149:7: 'xor'
					{
					match("xor"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:149:15: 'XOR'
					{
					match("XOR"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:150:4: ( 'or' | 'OR' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='o') ) {
				alt12=1;
			}
			else if ( (LA12_0=='O') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:150:6: 'or'
					{
					match("or"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:150:14: 'OR'
					{
					match("OR"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:151:5: ( 'and' | 'AND' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='a') ) {
				alt13=1;
			}
			else if ( (LA13_0=='A') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:151:7: 'and'
					{
					match("and"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:151:16: 'AND'
					{
					match("AND"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:152:5: ( ( '0' .. '9' )+ )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:152:11: ( '0' .. '9' )+
			{
			// /home/panda/Documenti/lab flc/myProj/riskV.g:152:11: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:153:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:153:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/panda/Documenti/lab flc/myProj/riskV.g:153:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:160:8: ( ( 'a' .. 'z' )+ )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:160:10: ( 'a' .. 'z' )+
			{
			// /home/panda/Documenti/lab flc/myProj/riskV.g:160:10: ( 'a' .. 'z' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:161:7: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:161:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/panda/Documenti/lab flc/myProj/riskV.g:162:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')||(LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'a' && LA17_0 <= 'z')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/panda/Documenti/lab flc/myProj/riskV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "ERROR"
	public final void mERROR() throws RecognitionException {
		try {
			int _type = ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/myProj/riskV.g:164:6: ( . )
			// /home/panda/Documenti/lab flc/myProj/riskV.g:164:8: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/panda/Documenti/lab flc/myProj/riskV.g:1:8: ( T__24 | TWODOT | CMP | DTYPE | RTYPE | JMP | ADDI | ANDI | ORI | XORI | ADD | SUB | MUL | XOR | OR | AND | INT | WS | STRING | ID | ERROR )
		int alt18=21;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:10: T__24
				{
				mT__24(); 

				}
				break;
			case 2 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:16: TWODOT
				{
				mTWODOT(); 

				}
				break;
			case 3 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:23: CMP
				{
				mCMP(); 

				}
				break;
			case 4 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:27: DTYPE
				{
				mDTYPE(); 

				}
				break;
			case 5 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:33: RTYPE
				{
				mRTYPE(); 

				}
				break;
			case 6 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:39: JMP
				{
				mJMP(); 

				}
				break;
			case 7 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:43: ADDI
				{
				mADDI(); 

				}
				break;
			case 8 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:48: ANDI
				{
				mANDI(); 

				}
				break;
			case 9 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:53: ORI
				{
				mORI(); 

				}
				break;
			case 10 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:57: XORI
				{
				mXORI(); 

				}
				break;
			case 11 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:62: ADD
				{
				mADD(); 

				}
				break;
			case 12 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:66: SUB
				{
				mSUB(); 

				}
				break;
			case 13 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:70: MUL
				{
				mMUL(); 

				}
				break;
			case 14 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:74: XOR
				{
				mXOR(); 

				}
				break;
			case 15 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:78: OR
				{
				mOR(); 

				}
				break;
			case 16 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:81: AND
				{
				mAND(); 

				}
				break;
			case 17 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 18 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:89: WS
				{
				mWS(); 

				}
				break;
			case 19 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:92: STRING
				{
				mSTRING(); 

				}
				break;
			case 20 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:99: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// /home/panda/Documenti/lab flc/myProj/riskV.g:1:102: ERROR
				{
				mERROR(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\1\uffff\1\27\1\uffff\4\32\1\46\1\32\1\46\1\32\1\46\1\32\1\46\1\32\1\46"+
		"\1\32\2\uffff\1\46\5\uffff\1\32\1\uffff\2\64\2\32\2\67\1\32\2\67\2\46"+
		"\1\uffff\1\46\2\32\2\103\1\46\1\32\1\46\1\32\1\46\1\32\1\uffff\1\113\1"+
		"\uffff\1\32\1\67\1\uffff\2\67\1\32\3\67\1\121\1\123\1\121\1\123\1\126"+
		"\1\uffff\1\32\2\130\2\132\2\133\1\uffff\2\134\2\67\1\135\1\uffff\1\136"+
		"\1\uffff\1\135\1\136\1\uffff\1\137\1\uffff\1\137\6\uffff";
	static final String DFA18_eofS =
		"\140\uffff";
	static final String DFA18_minS =
		"\1\0\1\170\1\uffff\1\115\1\102\2\105\1\60\1\104\1\60\1\122\1\60\1\117"+
		"\1\60\1\125\1\60\1\125\2\uffff\1\60\5\uffff\1\120\1\uffff\2\60\1\123\1"+
		"\120\2\60\1\105\4\60\1\uffff\1\60\2\104\3\60\1\122\1\60\1\102\1\60\1\114"+
		"\1\uffff\1\60\1\uffff\1\102\1\60\1\uffff\2\60\1\105\10\60\1\uffff\1\73"+
		"\6\60\1\uffff\5\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60"+
		"\6\uffff";
	static final String DFA18_maxS =
		"\1\uffff\1\170\1\uffff\1\115\1\127\1\105\1\132\1\172\1\116\1\172\1\122"+
		"\1\172\1\117\1\172\1\125\1\172\1\125\2\uffff\1\172\5\uffff\1\120\1\uffff"+
		"\2\172\1\123\1\120\2\172\1\132\4\172\1\uffff\1\172\2\104\3\172\1\122\1"+
		"\172\1\102\1\172\1\114\1\uffff\1\172\1\uffff\1\127\1\172\1\uffff\2\172"+
		"\1\105\10\172\1\uffff\1\73\6\172\1\uffff\5\172\1\uffff\1\172\1\uffff\2"+
		"\172\1\uffff\1\172\1\uffff\1\172\6\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\2\16\uffff\1\21\1\22\1\uffff\1\24\1\25\1\1\1\21\1\2\1\uffff"+
		"\1\24\13\uffff\1\23\13\uffff\1\22\1\uffff\1\4\2\uffff\1\6\13\uffff\1\17"+
		"\7\uffff\1\3\5\uffff\1\13\1\uffff\1\20\2\uffff\1\11\1\uffff\1\16\1\uffff"+
		"\1\14\1\15\1\5\1\7\1\10\1\12";
	static final String DFA18_specialS =
		"\1\0\137\uffff}>";
	static final String[] DFA18_transitionS = {
			"\11\25\2\22\2\25\1\22\22\25\1\22\17\25\1\1\11\21\1\2\6\25\1\10\1\24\1"+
			"\3\1\4\5\24\1\6\2\24\1\20\1\24\1\12\2\24\1\5\1\16\4\24\1\14\2\24\6\25"+
			"\1\7\13\23\1\17\1\23\1\11\3\23\1\15\4\23\1\13\2\23\uff85\25",
			"\1\26",
			"",
			"\1\31",
			"\1\33\24\uffff\1\34",
			"\1\35",
			"\1\37\1\uffff\1\42\4\uffff\1\43\1\36\1\41\13\uffff\1\40",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\47\1\44\11\47\1\45\14\47",
			"\1\50\11\uffff\1\51",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\47\1\52\10\47",
			"\1\53",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\47\1\54\13\47",
			"\1\55",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\47\1\56\5\47",
			"\1\57",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\47\1\60\5\47",
			"\1\61",
			"",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\65",
			"\1\66",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\70\1\uffff\1\73\4\uffff\1\72\15\uffff\1\71",
			"\12\32\7\uffff\4\32\1\74\25\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\4\32\1\75\25\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\47\1\76\26\47",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\47\1\77\26\47",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"\1\100",
			"\1\101",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\47\1\102\21\47",
			"\12\32\7\uffff\10\32\1\104\21\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\47\1\105\10\47",
			"\1\106",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\47\1\107\30\47",
			"\1\110",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\47\1\111\16\47",
			"\1\112",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\1\114\24\uffff\1\115",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\116",
			"\12\32\7\uffff\4\32\1\117\25\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\47\1\120\21\47",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\47\1\122\21\47",
			"\12\32\7\uffff\10\32\1\124\21\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\10\32\1\125\21\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"",
			"\1\126",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\47\1\127\21\47",
			"\12\32\7\uffff\10\32\1\131\21\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\47",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__24 | TWODOT | CMP | DTYPE | RTYPE | JMP | ADDI | ANDI | ORI | XORI | ADD | SUB | MUL | XOR | OR | AND | INT | WS | STRING | ID | ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA18_0 = input.LA(1);
						s = -1;
						if ( (LA18_0=='0') ) {s = 1;}
						else if ( (LA18_0==':') ) {s = 2;}
						else if ( (LA18_0=='C') ) {s = 3;}
						else if ( (LA18_0=='D') ) {s = 4;}
						else if ( (LA18_0=='R') ) {s = 5;}
						else if ( (LA18_0=='J') ) {s = 6;}
						else if ( (LA18_0=='a') ) {s = 7;}
						else if ( (LA18_0=='A') ) {s = 8;}
						else if ( (LA18_0=='o') ) {s = 9;}
						else if ( (LA18_0=='O') ) {s = 10;}
						else if ( (LA18_0=='x') ) {s = 11;}
						else if ( (LA18_0=='X') ) {s = 12;}
						else if ( (LA18_0=='s') ) {s = 13;}
						else if ( (LA18_0=='S') ) {s = 14;}
						else if ( (LA18_0=='m') ) {s = 15;}
						else if ( (LA18_0=='M') ) {s = 16;}
						else if ( ((LA18_0 >= '1' && LA18_0 <= '9')) ) {s = 17;}
						else if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 18;}
						else if ( ((LA18_0 >= 'b' && LA18_0 <= 'l')||LA18_0=='n'||(LA18_0 >= 'p' && LA18_0 <= 'r')||(LA18_0 >= 't' && LA18_0 <= 'w')||(LA18_0 >= 'y' && LA18_0 <= 'z')) ) {s = 19;}
						else if ( (LA18_0=='B'||(LA18_0 >= 'E' && LA18_0 <= 'I')||(LA18_0 >= 'K' && LA18_0 <= 'L')||LA18_0=='N'||(LA18_0 >= 'P' && LA18_0 <= 'Q')||(LA18_0 >= 'T' && LA18_0 <= 'W')||(LA18_0 >= 'Y' && LA18_0 <= 'Z')) ) {s = 20;}
						else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\b')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '\u001F')||(LA18_0 >= '!' && LA18_0 <= '/')||(LA18_0 >= ';' && LA18_0 <= '@')||(LA18_0 >= '[' && LA18_0 <= '`')||(LA18_0 >= '{' && LA18_0 <= '\uFFFF')) ) {s = 21;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 18, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
