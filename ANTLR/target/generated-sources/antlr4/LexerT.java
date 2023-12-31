// Generated from LexerT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, PLUS=4, EQUAL=5, L_PAR=6, R_PAR=7, L_CUR=8, R_CUR=9, 
		IF=10, INT=11, FLOAT=12, BOOL=13, VARNAME=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "PRINT", "PLUS", "EQUAL", "L_PAR", "R_PAR", "L_CUR", "R_CUR", 
		"IF", "INT", "FLOAT", "BOOL", "VARNAME", "WS"
	};


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\6\fB\n\f\r\f\16\fC\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16S\n\16\3\17\6"+
		"\17V\n\17\r\17\16\17W\3\20\6\20[\n\20\r\20\16\20\\\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"c\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5\'\3\2\2\2\7+\3\2\2\2\t\61\3\2"+
		"\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2"+
		"\25=\3\2\2\2\27A\3\2\2\2\31E\3\2\2\2\33R\3\2\2\2\35U\3\2\2\2\37Z\3\2\2"+
		"\2!\"\7d\2\2\"#\7g\2\2#$\7i\2\2$%\7k\2\2%&\7p\2\2&\4\3\2\2\2\'(\7g\2\2"+
		"()\7p\2\2)*\7f\2\2*\6\3\2\2\2+,\7r\2\2,-\7t\2\2-.\7k\2\2./\7p\2\2/\60"+
		"\7v\2\2\60\b\3\2\2\2\61\62\7-\2\2\62\n\3\2\2\2\63\64\7?\2\2\64\f\3\2\2"+
		"\2\65\66\7*\2\2\66\16\3\2\2\2\678\7+\2\28\20\3\2\2\29:\7}\2\2:\22\3\2"+
		"\2\2;<\7\177\2\2<\24\3\2\2\2=>\7k\2\2>?\7h\2\2?\26\3\2\2\2@B\t\2\2\2A"+
		"@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\30\3\2\2\2EF\5\27\f\2FG\7\60"+
		"\2\2GH\5\27\f\2H\32\3\2\2\2IJ\7V\2\2JK\7t\2\2KL\7w\2\2LS\7g\2\2MN\7H\2"+
		"\2NO\7c\2\2OP\7n\2\2PQ\7u\2\2QS\7g\2\2RI\3\2\2\2RM\3\2\2\2S\34\3\2\2\2"+
		"TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\36\3\2\2\2Y[\t\4\2"+
		"\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\20\2\2_ \3"+
		"\2\2\2\7\2CRW\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}