package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_pasos = 1, RULE_leer = 2, RULE_var = 3, RULE_print = 4, 
		RULE_incremento = 5, RULE_entero = 6, RULE_decimal = 7, RULE_num = 8, 
		RULE_constantes = 9, RULE_multiplicacion = 10, RULE_division = 11, RULE_suma = 12, 
		RULE_resta = 13, RULE_para = 14, RULE_si = 15, RULE_mientras = 16, RULE_logica = 17, 
		RULE_operacion = 18, RULE_condicional = 19, RULE_ciclo = 20, RULE_vardc = 21, 
		RULE_desarrollo = 22, RULE_sin = 23, RULE_cos = 24, RULE_tan = 25;
	public static final String[] ruleNames = {
		"program", "pasos", "leer", "var", "print", "incremento", "entero", "decimal", 
		"num", "constantes", "multiplicacion", "division", "suma", "resta", "para", 
		"si", "mientras", "logica", "operacion", "condicional", "ciclo", "vardc", 
		"desarrollo", "sin", "cos", "tan"
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

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<DesarrolloContext> desarrollo() {
			return getRuleContexts(DesarrolloContext.class);
		}
		public DesarrolloContext desarrollo(int i) {
			return getRuleContext(DesarrolloContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(BEGIN);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				desarrollo();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAN) | (1L << PRINT) | (1L << Para) | (1L << Si) | (1L << Mientras) | (1L << VAR))) != 0) );
			setState(58);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasosContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public PasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasosContext pasos() throws RecognitionException {
		PasosContext _localctx = new PasosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pasos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(60);
				print();
				}
				break;
			case SCAN:
				{
				setState(61);
				leer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ParserTParser.SCAN, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SCAN);
			setState(65);
			match(T__0);
			setState(66);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PRINT);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(71);
				var();
				}
				break;
			case ENTERO:
			case DECIMAL:
				{
				setState(72);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Increment() { return getToken(ParserTParser.Increment, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			var();
			setState(76);
			match(Increment);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(ParserTParser.ENTERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ENTERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(ParserTParser.DECIMAL, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(82);
				entero();
				}
				break;
			case DECIMAL:
				{
				setState(83);
				decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(86);
				num();
				}
				break;
			case VAR:
				{
				setState(87);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Thryp() { return getToken(ParserTParser.Thryp, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			var();
			setState(91);
			match(Synt);
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(92);
				num();
				}
				break;
			case VAR:
				{
				setState(93);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(96);
			match(Thryp);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(97);
				num();
				}
				break;
			case VAR:
				{
				setState(98);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Xynth() { return getToken(ParserTParser.Xynth, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			var();
			setState(102);
			match(Synt);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(103);
				num();
				}
				break;
			case VAR:
				{
				setState(104);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			match(Xynth);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(108);
				num();
				}
				break;
			case VAR:
				{
				setState(109);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumaContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Kryst() { return getToken(ParserTParser.Kryst, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			var();
			setState(113);
			match(Synt);
			setState(114);
			var();
			setState(115);
			match(Kryst);
			setState(116);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestaContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Skorn() { return getToken(ParserTParser.Skorn, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			var();
			setState(119);
			match(Synt);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(120);
				num();
				}
				break;
			case VAR:
				{
				setState(121);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			match(Skorn);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DECIMAL:
				{
				setState(125);
				num();
				}
				break;
			case VAR:
				{
				setState(126);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode Para() { return getToken(ParserTParser.Para, 0); }
		public VardcContext vardc() {
			return getRuleContext(VardcContext.class,0);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public List<DesarrolloContext> desarrollo() {
			return getRuleContexts(DesarrolloContext.class);
		}
		public DesarrolloContext desarrollo(int i) {
			return getRuleContext(DesarrolloContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Para);
			setState(130);
			match(T__0);
			setState(131);
			vardc();
			setState(132);
			match(T__2);
			setState(133);
			logica();
			setState(134);
			match(T__2);
			setState(135);
			incremento();
			setState(136);
			match(T__1);
			setState(137);
			match(T__3);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				desarrollo();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAN) | (1L << PRINT) | (1L << Para) | (1L << Si) | (1L << Mientras) | (1L << VAR))) != 0) );
			setState(143);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode Si() { return getToken(ParserTParser.Si, 0); }
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public List<DesarrolloContext> desarrollo() {
			return getRuleContexts(DesarrolloContext.class);
		}
		public DesarrolloContext desarrollo(int i) {
			return getRuleContext(DesarrolloContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(Si);
			setState(146);
			match(T__0);
			setState(147);
			logica();
			setState(148);
			match(T__1);
			setState(149);
			match(T__3);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				desarrollo();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAN) | (1L << PRINT) | (1L << Para) | (1L << Si) | (1L << Mientras) | (1L << VAR))) != 0) );
			setState(155);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode Mientras() { return getToken(ParserTParser.Mientras, 0); }
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public List<DesarrolloContext> desarrollo() {
			return getRuleContexts(DesarrolloContext.class);
		}
		public DesarrolloContext desarrollo(int i) {
			return getRuleContext(DesarrolloContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Mientras);
			setState(158);
			match(T__0);
			setState(159);
			logica();
			setState(160);
			match(T__1);
			setState(161);
			match(T__3);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				desarrollo();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAN) | (1L << PRINT) | (1L << Para) | (1L << Si) | (1L << Mientras) | (1L << VAR))) != 0) );
			setState(167);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicaContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Mayor() { return getToken(ParserTParser.Mayor, 0); }
		public TerminalNode Menor() { return getToken(ParserTParser.Menor, 0); }
		public TerminalNode Eqeq() { return getToken(ParserTParser.Eqeq, 0); }
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			var();
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mayor) | (1L << Menor) | (1L << Eqeq))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			num();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public TanContext tan() {
			return getRuleContext(TanContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operacion);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				multiplicacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				division();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				suma();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				resta();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				incremento();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				sin();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				cos();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				tan();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			si();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ciclo);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Para:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				para();
				}
				break;
			case Mientras:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				mientras();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardcContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VardcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVardc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardcContext vardc() throws RecognitionException {
		VardcContext _localctx = new VardcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vardc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			var();
			setState(190);
			match(Synt);
			setState(191);
			num();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesarrolloContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public VardcContext vardc() {
			return getRuleContext(VardcContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public DesarrolloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desarrollo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDesarrollo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesarrolloContext desarrollo() throws RecognitionException {
		DesarrolloContext _localctx = new DesarrolloContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_desarrollo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(193);
				operacion();
				}
				break;
			case 2:
				{
				setState(194);
				pasos();
				}
				break;
			case 3:
				{
				setState(195);
				vardc();
				}
				break;
			case 4:
				{
				setState(196);
				condicional();
				}
				break;
			case 5:
				{
				setState(197);
				ciclo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Xyrt() { return getToken(ParserTParser.Xyrt, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			var();
			setState(201);
			match(Synt);
			setState(202);
			match(Xyrt);
			setState(203);
			match(T__0);
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(204);
				var();
				}
				break;
			case ENTERO:
			case DECIMAL:
				{
				setState(205);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(208);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CosContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Zynt() { return getToken(ParserTParser.Zynt, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			var();
			setState(211);
			match(Synt);
			setState(212);
			match(Zynt);
			setState(213);
			match(T__0);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(214);
				var();
				}
				break;
			case ENTERO:
			case DECIMAL:
				{
				setState(215);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TanContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode Synt() { return getToken(ParserTParser.Synt, 0); }
		public TerminalNode Tynt() { return getToken(ParserTParser.Tynt, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tan; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TanContext tan() throws RecognitionException {
		TanContext _localctx = new TanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			var();
			setState(221);
			match(Synt);
			setState(222);
			match(Tynt);
			setState(223);
			match(T__0);
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(224);
				var();
				}
				break;
			case ENTERO:
			case DECIMAL:
				{
				setState(225);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\6\29\n\2\r\2\16\2:\3\2\3\2\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\5\nW\n\n\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\5\fa\n\f"+
		"\3\f\3\f\3\f\5\ff\n\f\3\r\3\r\3\r\3\r\5\rl\n\r\3\r\3\r\3\r\5\rq\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17}\n\17\3\17\3\17"+
		"\3\17\5\17\u0082\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\6\20\u008e\n\20\r\20\16\20\u008f\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\6\21\u009a\n\21\r\21\16\21\u009b\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u00a6\n\22\r\22\16\22\u00a7\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b8\n\24\3\25\3\25\3\26"+
		"\3\26\5\26\u00be\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00c9\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d1\n\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u00db\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00e5\n\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\3\2\34\36\2\u00eb\2\66\3\2"+
		"\2\2\4@\3\2\2\2\6B\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16P\3\2\2"+
		"\2\20R\3\2\2\2\22V\3\2\2\2\24Z\3\2\2\2\26\\\3\2\2\2\30g\3\2\2\2\32r\3"+
		"\2\2\2\34x\3\2\2\2\36\u0083\3\2\2\2 \u0093\3\2\2\2\"\u009f\3\2\2\2$\u00ab"+
		"\3\2\2\2&\u00b7\3\2\2\2(\u00b9\3\2\2\2*\u00bd\3\2\2\2,\u00bf\3\2\2\2."+
		"\u00c8\3\2\2\2\60\u00ca\3\2\2\2\62\u00d4\3\2\2\2\64\u00de\3\2\2\2\668"+
		"\7\b\2\2\679\5.\30\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2<=\7\t\2\2=\3\3\2\2\2>A\5\n\6\2?A\5\6\4\2@>\3\2\2\2@?\3\2\2\2A\5\3\2"+
		"\2\2BC\7\n\2\2CD\7\3\2\2DE\7\4\2\2E\7\3\2\2\2FG\7\"\2\2G\t\3\2\2\2HK\7"+
		"\13\2\2IL\5\b\5\2JL\5\22\n\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MN\5\b\5\2"+
		"NO\7\24\2\2O\r\3\2\2\2PQ\7\f\2\2Q\17\3\2\2\2RS\7\r\2\2S\21\3\2\2\2TW\5"+
		"\16\b\2UW\5\20\t\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2X[\5\22\n\2Y[\5\b\5"+
		"\2ZX\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\]\5\b\5\2]`\7\16\2\2^a\5\22\n\2_a"+
		"\5\b\5\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2be\7\20\2\2cf\5\22\n\2df\5\b\5\2"+
		"ec\3\2\2\2ed\3\2\2\2f\27\3\2\2\2gh\5\b\5\2hk\7\16\2\2il\5\22\n\2jl\5\b"+
		"\5\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mp\7\21\2\2nq\5\22\n\2oq\5\b\5\2pn\3"+
		"\2\2\2po\3\2\2\2q\31\3\2\2\2rs\5\b\5\2st\7\16\2\2tu\5\b\5\2uv\7\23\2\2"+
		"vw\5\b\5\2w\33\3\2\2\2xy\5\b\5\2y|\7\16\2\2z}\5\22\n\2{}\5\b\5\2|z\3\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~\u0081\7\22\2\2\177\u0082\5\22\n\2\u0080\u0082"+
		"\5\b\5\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\35\3\2\2\2\u0083"+
		"\u0084\7\37\2\2\u0084\u0085\7\3\2\2\u0085\u0086\5,\27\2\u0086\u0087\7"+
		"\5\2\2\u0087\u0088\5$\23\2\u0088\u0089\7\5\2\2\u0089\u008a\5\f\7\2\u008a"+
		"\u008b\7\4\2\2\u008b\u008d\7\6\2\2\u008c\u008e\5.\30\2\u008d\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\7\2\2\u0092\37\3\2\2\2\u0093\u0094\7 \2\2"+
		"\u0094\u0095\7\3\2\2\u0095\u0096\5$\23\2\u0096\u0097\7\4\2\2\u0097\u0099"+
		"\7\6\2\2\u0098\u009a\5.\30\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\7"+
		"\2\2\u009e!\3\2\2\2\u009f\u00a0\7!\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2"+
		"\5$\23\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\7\6\2\2\u00a4\u00a6\5.\30\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\7\2\2\u00aa#\3\2\2\2\u00ab\u00ac"+
		"\5\b\5\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\5\22\n\2\u00ae%\3\2\2\2\u00af"+
		"\u00b8\5\26\f\2\u00b0\u00b8\5\30\r\2\u00b1\u00b8\5\32\16\2\u00b2\u00b8"+
		"\5\34\17\2\u00b3\u00b8\5\f\7\2\u00b4\u00b8\5\60\31\2\u00b5\u00b8\5\62"+
		"\32\2\u00b6\u00b8\5\64\33\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00ba"+
		"\5 \21\2\u00ba)\3\2\2\2\u00bb\u00be\5\36\20\2\u00bc\u00be\5\"\22\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be+\3\2\2\2\u00bf\u00c0\5\b\5\2"+
		"\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5\22\n\2\u00c2-\3\2\2\2\u00c3\u00c9"+
		"\5&\24\2\u00c4\u00c9\5\4\3\2\u00c5\u00c9\5,\27\2\u00c6\u00c9\5(\25\2\u00c7"+
		"\u00c9\5*\26\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9/\3\2\2\2\u00ca\u00cb"+
		"\5\b\5\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00d0\7\3\2\2"+
		"\u00ce\u00d1\5\b\5\2\u00cf\u00d1\5\22\n\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\61\3\2\2\2\u00d4"+
		"\u00d5\5\b\5\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00da\7"+
		"\3\2\2\u00d8\u00db\5\b\5\2\u00d9\u00db\5\22\n\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd\63\3\2\2"+
		"\2\u00de\u00df\5\b\5\2\u00df\u00e0\7\16\2\2\u00e0\u00e1\7\27\2\2\u00e1"+
		"\u00e4\7\3\2\2\u00e2\u00e5\5\b\5\2\u00e3\u00e5\5\22\n\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7"+
		"\65\3\2\2\2\26:@KVZ`ekp|\u0081\u008f\u009b\u00a7\u00b7\u00bd\u00c8\u00d0"+
		"\u00da\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}