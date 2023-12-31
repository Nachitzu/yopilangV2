package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BEGIN=6, END=7, SCAN=8, PRINT=9, 
		ENTERO=10, DECIMAL=11, Synt=12, Ekval=13, Thryp=14, Xynth=15, Skorn=16, 
		Kryst=17, Increment=18, Xyrt=19, Zynt=20, Tynt=21, NULL=22, PI=23, PITUFINUMERO=24, 
		EULER=25, Mayor=26, Menor=27, Eqeq=28, Para=29, Si=30, Mientras=31, VAR=32, 
		WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "BEGIN", "END", "SCAN", "PRINT", 
		"ENTERO", "DECIMAL", "Synt", "Ekval", "Thryp", "Xynth", "Skorn", "Kryst", 
		"Increment", "Xyrt", "Zynt", "Tynt", "NULL", "PI", "PITUFINUMERO", "EULER", 
		"Mayor", "Menor", "Eqeq", "Para", "Si", "Mientras", "VAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "'{'", "'}'", "'Xylok'", "'Zynd'", "'Draxvokzirplor'", 
		"'plork'", null, null, "'='", "'=='", "'*'", "'/'", "'-'", "'+'", "'SakSak'", 
		"'sin'", "'cos'", "'tan'", "'NULL'", "'3.1415'", "'1.58'", "'2.71828'", 
		"'mayoht'", "'Menhok'", "'Ekval'", "'Krodf'", "'Bik'", "'Kylef'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BEGIN", "END", "SCAN", "PRINT", "ENTERO", 
		"DECIMAL", "Synt", "Ekval", "Thryp", "Xynth", "Skorn", "Kryst", "Increment", 
		"Xyrt", "Zynt", "Tynt", "NULL", "PI", "PITUFINUMERO", "EULER", "Mayor", 
		"Menor", "Eqeq", "Para", "Si", "Mientras", "VAR", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13q\n\13\r\13\16\13r\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00d7\n!\r!\16!\u00d8"+
		"\3!\6!\u00dc\n!\r!\16!\u00dd\5!\u00e0\n!\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\""+
		"\2\u00ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17U\3\2\2\2\21"+
		"Z\3\2\2\2\23i\3\2\2\2\25p\3\2\2\2\27t\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2"+
		"\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2"+
		"\2\'\u008c\3\2\2\2)\u0090\3\2\2\2+\u0094\3\2\2\2-\u0098\3\2\2\2/\u009d"+
		"\3\2\2\2\61\u00a4\3\2\2\2\63\u00a9\3\2\2\2\65\u00b1\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00bf\3\2\2\2;\u00c5\3\2\2\2=\u00cb\3\2\2\2?\u00cf\3\2\2\2A\u00df"+
		"\3\2\2\2C\u00e2\3\2\2\2EF\7*\2\2F\4\3\2\2\2GH\7+\2\2H\6\3\2\2\2IJ\7=\2"+
		"\2J\b\3\2\2\2KL\7}\2\2L\n\3\2\2\2MN\7\177\2\2N\f\3\2\2\2OP\7Z\2\2PQ\7"+
		"{\2\2QR\7n\2\2RS\7q\2\2ST\7m\2\2T\16\3\2\2\2UV\7\\\2\2VW\7{\2\2WX\7p\2"+
		"\2XY\7f\2\2Y\20\3\2\2\2Z[\7F\2\2[\\\7t\2\2\\]\7c\2\2]^\7z\2\2^_\7x\2\2"+
		"_`\7q\2\2`a\7m\2\2ab\7|\2\2bc\7k\2\2cd\7t\2\2de\7r\2\2ef\7n\2\2fg\7q\2"+
		"\2gh\7t\2\2h\22\3\2\2\2ij\7r\2\2jk\7n\2\2kl\7q\2\2lm\7t\2\2mn\7m\2\2n"+
		"\24\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\26\3\2"+
		"\2\2tu\5\25\13\2uv\7\60\2\2vw\5\25\13\2w\30\3\2\2\2xy\7?\2\2y\32\3\2\2"+
		"\2z{\7?\2\2{|\7?\2\2|\34\3\2\2\2}~\7,\2\2~\36\3\2\2\2\177\u0080\7\61\2"+
		"\2\u0080 \3\2\2\2\u0081\u0082\7/\2\2\u0082\"\3\2\2\2\u0083\u0084\7-\2"+
		"\2\u0084$\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7c\2\2\u0087\u0088\7"+
		"m\2\2\u0088\u0089\7U\2\2\u0089\u008a\7c\2\2\u008a\u008b\7m\2\2\u008b&"+
		"\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f"+
		"(\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7u\2\2\u0093"+
		"*\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097"+
		",\3\2\2\2\u0098\u0099\7P\2\2\u0099\u009a\7W\2\2\u009a\u009b\7N\2\2\u009b"+
		"\u009c\7N\2\2\u009c.\3\2\2\2\u009d\u009e\7\65\2\2\u009e\u009f\7\60\2\2"+
		"\u009f\u00a0\7\63\2\2\u00a0\u00a1\7\66\2\2\u00a1\u00a2\7\63\2\2\u00a2"+
		"\u00a3\7\67\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7\63\2\2\u00a5\u00a6\7\60"+
		"\2\2\u00a6\u00a7\7\67\2\2\u00a7\u00a8\7:\2\2\u00a8\62\3\2\2\2\u00a9\u00aa"+
		"\7\64\2\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\79\2\2\u00ac\u00ad\7\63\2\2"+
		"\u00ad\u00ae\7:\2\2\u00ae\u00af\7\64\2\2\u00af\u00b0\7:\2\2\u00b0\64\3"+
		"\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7{\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7v\2\2\u00b7\66\3\2\2\2\u00b8"+
		"\u00b9\7O\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7j\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7m\2\2\u00be8\3\2\2\2\u00bf\u00c0\7G\2"+
		"\2\u00c0\u00c1\7m\2\2\u00c1\u00c2\7x\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7M\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7h\2\2\u00ca<\3\2\2\2\u00cb\u00cc"+
		"\7D\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7m\2\2\u00ce>\3\2\2\2\u00cf\u00d0"+
		"\7M\2\2\u00d0\u00d1\7{\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4@\3\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e0\3\2"+
		"\2\2\u00da\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2"+
		"\2\2\u00df\u00db\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b\"\2\2\u00e7D\3\2\2\2\b\2r\u00d8\u00dd\u00df"+
		"\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}