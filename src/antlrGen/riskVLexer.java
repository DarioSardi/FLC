// $ANTLR 3.5.1 /home/panda/Documenti/lab flc/RiskV/resources/riskV.g 2019-03-13 23:32:45

  package antlrGen;
  import extraClass.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class riskVLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "/home/panda/Documenti/lab flc/RiskV/resources/riskV.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:12:7: ( '0x' )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:12:9: '0x'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:13:7: ( '\\n' )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:13:9: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "TWODOT"
	public final void mTWODOT() throws RecognitionException {
		try {
			int _type = TWODOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:163:8: ( ':' )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:163:10: ':'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:164:5: ( 'CMP' )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:164:7: 'CMP'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:165:7: ( 'DB' | 'DW' )
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
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:165:9: 'DB'
					{
					match("DB"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:165:14: 'DW'
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

	// $ANTLR start "VTYPE"
	public final void mVTYPE() throws RecognitionException {
		try {
			int _type = VTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:166:7: ( 'RESB' | 'RESW' )
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
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:166:9: 'RESB'
					{
					match("RESB"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:166:18: 'RESW'
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
	// $ANTLR end "VTYPE"

	// $ANTLR start "RTYPE"
	public final void mRTYPE() throws RecognitionException {
		try {
			int _type = RTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:167:7: ( 'DR' | 'DRR' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='D') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='R') ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2=='R') ) {
						alt3=2;
					}

					else {
						alt3=1;
					}

				}

				else {
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
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:167:9: 'DR'
					{
					match("DR"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:167:15: 'DRR'
					{
					match("DRR"); 

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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:168:5: ( 'JMP' | 'JE' | 'JZ' | 'JNE' | 'JNZ' | 'JG' | 'JNLE' | 'JGE' | 'JNG' | 'JL' | 'JNGE' | 'JLE' )
			int alt4=12;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='J') ) {
				switch ( input.LA(2) ) {
				case 'M':
					{
					alt4=1;
					}
					break;
				case 'E':
					{
					alt4=2;
					}
					break;
				case 'Z':
					{
					alt4=3;
					}
					break;
				case 'N':
					{
					switch ( input.LA(3) ) {
					case 'E':
						{
						alt4=4;
						}
						break;
					case 'Z':
						{
						alt4=5;
						}
						break;
					case 'L':
						{
						alt4=7;
						}
						break;
					case 'G':
						{
						int LA4_11 = input.LA(4);
						if ( (LA4_11=='E') ) {
							alt4=11;
						}

						else {
							alt4=9;
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
								new NoViableAltException("", 4, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'G':
					{
					int LA4_6 = input.LA(3);
					if ( (LA4_6=='E') ) {
						alt4=8;
					}

					else {
						alt4=6;
					}

					}
					break;
				case 'L':
					{
					int LA4_7 = input.LA(3);
					if ( (LA4_7=='E') ) {
						alt4=12;
					}

					else {
						alt4=10;
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:168:7: 'JMP'
					{
					match("JMP"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:168:15: 'JE'
					{
					match("JE"); 

					}
					break;
				case 3 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:168:23: 'JZ'
					{
					match("JZ"); 

					}
					break;
				case 4 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:169:3: 'JNE'
					{
					match("JNE"); 

					}
					break;
				case 5 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:169:11: 'JNZ'
					{
					match("JNZ"); 

					}
					break;
				case 6 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:169:19: 'JG'
					{
					match("JG"); 

					}
					break;
				case 7 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:170:3: 'JNLE'
					{
					match("JNLE"); 

					}
					break;
				case 8 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:170:11: 'JGE'
					{
					match("JGE"); 

					}
					break;
				case 9 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:170:19: 'JNG'
					{
					match("JNG"); 

					}
					break;
				case 10 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:171:3: 'JL'
					{
					match("JL"); 

					}
					break;
				case 11 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:171:10: 'JNGE'
					{
					match("JNGE"); 

					}
					break;
				case 12 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:171:19: 'JLE'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:174:6: ( 'addi' | 'ADDI' )
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
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:174:8: 'addi'
					{
					match("addi"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:174:17: 'ADDI'
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

	// $ANTLR start "SUBI"
	public final void mSUBI() throws RecognitionException {
		try {
			int _type = SUBI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:175:6: ( 'subi' | 'SUBI' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='s') ) {
				alt6=1;
			}
			else if ( (LA6_0=='S') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:175:8: 'subi'
					{
					match("subi"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:175:17: 'SUBI'
					{
					match("SUBI"); 

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
	// $ANTLR end "SUBI"

	// $ANTLR start "ANDI"
	public final void mANDI() throws RecognitionException {
		try {
			int _type = ANDI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:176:6: ( 'andi' | 'ANDI' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='A') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:176:8: 'andi'
					{
					match("andi"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:176:17: 'ANDI'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:177:5: ( 'ori' | 'ORI;' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='o') ) {
				alt8=1;
			}
			else if ( (LA8_0=='O') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:177:7: 'ori'
					{
					match("ori"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:177:15: 'ORI;'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:178:6: ( 'xori' | 'XORI' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='x') ) {
				alt9=1;
			}
			else if ( (LA9_0=='X') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:178:8: 'xori'
					{
					match("xori"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:178:18: 'XORI'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:179:5: ( 'add' | 'ADD' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='a') ) {
				alt10=1;
			}
			else if ( (LA10_0=='A') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:179:7: 'add'
					{
					match("add"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:179:16: 'ADD'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:180:5: ( 'sub' | 'SUB' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='s') ) {
				alt11=1;
			}
			else if ( (LA11_0=='S') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:180:7: 'sub'
					{
					match("sub"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:180:16: 'SUB'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:181:5: ( 'mul' | 'MUL' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='m') ) {
				alt12=1;
			}
			else if ( (LA12_0=='M') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:181:7: 'mul'
					{
					match("mul"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:181:15: 'MUL'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:182:5: ( 'xor' | 'XOR' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='x') ) {
				alt13=1;
			}
			else if ( (LA13_0=='X') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:182:7: 'xor'
					{
					match("xor"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:182:15: 'XOR'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:183:4: ( 'or' | 'OR' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='o') ) {
				alt14=1;
			}
			else if ( (LA14_0=='O') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:183:6: 'or'
					{
					match("or"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:183:14: 'OR'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:184:5: ( 'and' | 'AND' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='a') ) {
				alt15=1;
			}
			else if ( (LA15_0=='A') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:184:7: 'and'
					{
					match("and"); 

					}
					break;
				case 2 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:184:16: 'AND'
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:185:5: ( ( '0' .. '9' )+ )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:185:11: ( '0' .. '9' )+
			{
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:185:11: ( '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:
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
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:186:5: ( ( ' ' | '\\t' | '\\r' )+ )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:186:9: ( ' ' | '\\t' | '\\r' )+
			{
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:186:9: ( ' ' | '\\t' | '\\r' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\t'||LA17_0=='\r'||LA17_0==' ') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
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
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:193:8: ( ( 'a' .. 'z' )+ )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:193:10: ( 'a' .. 'z' )+
			{
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:193:10: ( 'a' .. 'z' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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

	// $ANTLR start "ERROR"
	public final void mERROR() throws RecognitionException {
		try {
			int _type = ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:194:6: ( . )
			// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:194:8: .
			{
			matchAny(); 
			System.out.println("what?...");
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
		// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:8: ( T__25 | T__26 | TWODOT | CMP | DTYPE | VTYPE | RTYPE | JMP | ADDI | SUBI | ANDI | ORI | XORI | ADD | SUB | MUL | XOR | OR | AND | INT | WS | STRING | ERROR )
		int alt19=23;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:22: TWODOT
				{
				mTWODOT(); 

				}
				break;
			case 4 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:29: CMP
				{
				mCMP(); 

				}
				break;
			case 5 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:33: DTYPE
				{
				mDTYPE(); 

				}
				break;
			case 6 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:39: VTYPE
				{
				mVTYPE(); 

				}
				break;
			case 7 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:45: RTYPE
				{
				mRTYPE(); 

				}
				break;
			case 8 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:51: JMP
				{
				mJMP(); 

				}
				break;
			case 9 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:55: ADDI
				{
				mADDI(); 

				}
				break;
			case 10 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:60: SUBI
				{
				mSUBI(); 

				}
				break;
			case 11 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:65: ANDI
				{
				mANDI(); 

				}
				break;
			case 12 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:70: ORI
				{
				mORI(); 

				}
				break;
			case 13 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:74: XORI
				{
				mXORI(); 

				}
				break;
			case 14 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:79: ADD
				{
				mADD(); 

				}
				break;
			case 15 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:83: SUB
				{
				mSUB(); 

				}
				break;
			case 16 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:87: MUL
				{
				mMUL(); 

				}
				break;
			case 17 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:91: XOR
				{
				mXOR(); 

				}
				break;
			case 18 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:95: OR
				{
				mOR(); 

				}
				break;
			case 19 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:98: AND
				{
				mAND(); 

				}
				break;
			case 20 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:102: INT
				{
				mINT(); 

				}
				break;
			case 21 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:106: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:109: STRING
				{
				mSTRING(); 

				}
				break;
			case 23 :
				// /home/panda/Documenti/lab flc/RiskV/resources/riskV.g:1:116: ERROR
				{
				mERROR(); 

				}
				break;

		}
	}


	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA19_eotS =
		"\1\uffff\1\27\2\uffff\4\25\1\41\1\25\1\41\1\25\1\41\1\25\1\41\1\25\1\41"+
		"\1\25\15\uffff\2\41\3\uffff\1\41\1\uffff\2\64\1\41\1\uffff\1\41\2\uffff"+
		"\1\72\1\74\1\72\1\74\2\100\1\65\2\uffff\2\103\1\53\1\75\1\uffff\1\76\3"+
		"\uffff\1\101\2\uffff\1\104\2\uffff";
	static final String DFA19_eofS =
		"\105\uffff";
	static final String DFA19_minS =
		"\1\0\1\170\2\uffff\1\115\1\102\2\105\1\144\1\104\1\165\1\125\1\162\1\122"+
		"\1\157\1\117\1\165\1\125\15\uffff\2\144\1\uffff\2\104\1\142\1\102\1\141"+
		"\1\111\1\162\1\122\1\154\2\uffff\2\141\2\111\1\141\1\111\1\141\2\uffff"+
		"\1\141\1\111\2\141\1\uffff\1\141\3\uffff\1\141\2\uffff\1\141\2\uffff";
	static final String DFA19_maxS =
		"\1\uffff\1\170\2\uffff\1\115\1\127\1\105\1\132\1\156\1\116\1\165\1\125"+
		"\1\162\1\122\1\157\1\117\1\165\1\125\15\uffff\2\144\1\uffff\2\104\1\142"+
		"\1\102\1\172\1\111\1\162\1\122\1\154\2\uffff\2\172\2\111\1\172\1\111\1"+
		"\172\2\uffff\1\172\1\111\2\172\1\uffff\1\172\3\uffff\1\172\2\uffff\1\172"+
		"\2\uffff";
	static final String DFA19_acceptS =
		"\2\uffff\1\2\1\3\16\uffff\1\24\1\25\1\26\1\27\1\1\1\24\1\2\1\3\1\4\1\5"+
		"\1\7\1\6\1\10\2\uffff\1\26\11\uffff\1\20\1\25\7\uffff\1\22\1\14\4\uffff"+
		"\1\16\1\uffff\1\23\1\11\1\13\1\uffff\1\17\1\12\1\uffff\1\21\1\15";
	static final String DFA19_specialS =
		"\1\0\104\uffff}>";
	static final String[] DFA19_transitionS = {
			"\11\25\1\23\1\2\2\25\1\23\22\25\1\23\17\25\1\1\11\22\1\3\6\25\1\11\1"+
			"\25\1\4\1\5\5\25\1\7\2\25\1\21\1\25\1\15\2\25\1\6\1\13\4\25\1\17\10\25"+
			"\1\10\13\24\1\20\1\24\1\14\3\24\1\12\4\24\1\16\2\24\uff85\25",
			"\1\26",
			"",
			"",
			"\1\32",
			"\1\33\17\uffff\1\34\4\uffff\1\33",
			"\1\35",
			"\1\36\1\uffff\1\36\4\uffff\3\36\13\uffff\1\36",
			"\1\37\11\uffff\1\40",
			"\1\42\11\uffff\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\10\41\1\63\21\41",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"\10\41\1\71\21\41",
			"\10\41\1\73\21\41",
			"\1\75",
			"\1\76",
			"\10\41\1\77\21\41",
			"\1\101",
			"\32\41",
			"",
			"",
			"\10\41\1\102\21\41",
			"\1\104",
			"\32\41",
			"\32\41",
			"",
			"\32\41",
			"",
			"",
			"",
			"\32\41",
			"",
			"",
			"\32\41",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | TWODOT | CMP | DTYPE | VTYPE | RTYPE | JMP | ADDI | SUBI | ANDI | ORI | XORI | ADD | SUB | MUL | XOR | OR | AND | INT | WS | STRING | ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_0 = input.LA(1);
						s = -1;
						if ( (LA19_0=='0') ) {s = 1;}
						else if ( (LA19_0=='\n') ) {s = 2;}
						else if ( (LA19_0==':') ) {s = 3;}
						else if ( (LA19_0=='C') ) {s = 4;}
						else if ( (LA19_0=='D') ) {s = 5;}
						else if ( (LA19_0=='R') ) {s = 6;}
						else if ( (LA19_0=='J') ) {s = 7;}
						else if ( (LA19_0=='a') ) {s = 8;}
						else if ( (LA19_0=='A') ) {s = 9;}
						else if ( (LA19_0=='s') ) {s = 10;}
						else if ( (LA19_0=='S') ) {s = 11;}
						else if ( (LA19_0=='o') ) {s = 12;}
						else if ( (LA19_0=='O') ) {s = 13;}
						else if ( (LA19_0=='x') ) {s = 14;}
						else if ( (LA19_0=='X') ) {s = 15;}
						else if ( (LA19_0=='m') ) {s = 16;}
						else if ( (LA19_0=='M') ) {s = 17;}
						else if ( ((LA19_0 >= '1' && LA19_0 <= '9')) ) {s = 18;}
						else if ( (LA19_0=='\t'||LA19_0=='\r'||LA19_0==' ') ) {s = 19;}
						else if ( ((LA19_0 >= 'b' && LA19_0 <= 'l')||LA19_0=='n'||(LA19_0 >= 'p' && LA19_0 <= 'r')||(LA19_0 >= 't' && LA19_0 <= 'w')||(LA19_0 >= 'y' && LA19_0 <= 'z')) ) {s = 20;}
						else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\b')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\u001F')||(LA19_0 >= '!' && LA19_0 <= '/')||(LA19_0 >= ';' && LA19_0 <= '@')||LA19_0=='B'||(LA19_0 >= 'E' && LA19_0 <= 'I')||(LA19_0 >= 'K' && LA19_0 <= 'L')||LA19_0=='N'||(LA19_0 >= 'P' && LA19_0 <= 'Q')||(LA19_0 >= 'T' && LA19_0 <= 'W')||(LA19_0 >= 'Y' && LA19_0 <= '`')||(LA19_0 >= '{' && LA19_0 <= '\uFFFF')) ) {s = 21;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
