// Generated from ParserT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, PLUS=4, EQUAL=5, L_PAR=6, R_PAR=7, L_CUR=8, R_CUR=9, 
		IF=10, INT=11, FLOAT=12, BOOL=13, VARNAME=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'begin'", "'end'", "'print'", "'+'", "'='", "'('", "')'", 
		"'{'", "'}'", "'if'", "INT", "FLOAT", "BOOL", "VARNAME", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_if_st = 2, RULE_suma = 3, RULE_vardeclaration = 4, 
		RULE_print = 5;
	public static final String[] ruleNames = {
		"program", "statement", "if_st", "suma", "vardeclaration", "print"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(12); match(BEGIN);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13); statement();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << VARNAME))) != 0) );
			setState(18); match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public If_stContext if_st() {
			return getRuleContext(If_stContext.class,0);
		}
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); suma();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22); vardeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23); if_st();
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

	public static class If_stContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public TerminalNode BOOL() { return getToken(ParserTParser.BOOL, 0); }
		public TerminalNode L_CUR() { return getToken(ParserTParser.L_CUR, 0); }
		public TerminalNode R_CUR() { return getToken(ParserTParser.R_CUR, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public If_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_st; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIf_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stContext if_st() throws RecognitionException {
		If_stContext _localctx = new If_stContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(IF);
			setState(27); match(L_PAR);
			setState(28); match(BOOL);
			setState(29); match(R_PAR);
			setState(30); match(L_CUR);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31); statement();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << VARNAME))) != 0) );
			setState(36); match(R_CUR);
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
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
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
		enterRule(_localctx, 6, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(VARNAME);
			setState(39); match(EQUAL);
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VARNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(41); match(PLUS);
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VARNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VardeclarationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(VARNAME);
			setState(45); match(EQUAL);
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
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
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(PRINT);
			setState(49); match(L_PAR);
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VARNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(51); match(R_PAR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\218\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4#\n\4\r\4\16"+
		"\4$\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\4\4\2\r\16\20\20\3\2\r\16\66\2\16\3\2\2\2\4"+
		"\32\3\2\2\2\6\34\3\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f\62\3\2\2\2\16\20\7\3"+
		"\2\2\17\21\5\4\3\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\24\3\2\2\2\24\25\7\4\2\2\25\3\3\2\2\2\26\33\5\f\7\2\27\33\5\b"+
		"\5\2\30\33\5\n\6\2\31\33\5\6\4\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2"+
		"\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\f\2\2\35\36\7\b\2\2\36\37\7\17"+
		"\2\2\37 \7\t\2\2 \"\7\n\2\2!#\5\4\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2"+
		"$%\3\2\2\2%&\3\2\2\2&\'\7\13\2\2\'\7\3\2\2\2()\7\20\2\2)*\7\7\2\2*+\t"+
		"\2\2\2+,\7\6\2\2,-\t\2\2\2-\t\3\2\2\2./\7\20\2\2/\60\7\7\2\2\60\61\t\3"+
		"\2\2\61\13\3\2\2\2\62\63\7\5\2\2\63\64\7\b\2\2\64\65\t\2\2\2\65\66\7\t"+
		"\2\2\66\r\3\2\2\2\5\22\32$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}