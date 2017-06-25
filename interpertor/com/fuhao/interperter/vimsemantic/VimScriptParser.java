// Generated from E:/YSI/CodePlatform/interpertor/com/fuhao/interperter/vimsemantic\VimScript.g4 by ANTLR 4.7
package com.fuhao.interperter.vimsemantic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VimScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, EQUAL=17, 
		LE=18, GE=19, BANG=20, ASSIGN=21, GT=22, LT=23, ADD=24, SUB=25, MUL=26, 
		DIV=27, ADD_ASSIGN=28, SUB_ASSIGN=29, MUL_ASSIGN=30, DIV_ASSIGN=31, MOD_ASSIGN=32, 
		LET=33, UNLET=34, RETURN=35, FUNCTION=36, ENDFUNCTION=37, IF=38, ENDIF=39, 
		ELSE=40, ELSEIF=41, CONTINUE=42, BREAK=43, WHILE=44, ENDWHILE=45, FOR=46, 
		In=47, ENDFOR=48, ECHO=49, CALL=50, FloatLiteral=51, IntegerLiteral=52, 
		StringLiteral=53, IdLiteral=54, WS=55, LINE_COMMENT=56;
	public static final int
		RULE_allStatement = 0, RULE_statements = 1, RULE_for_ = 2, RULE_creationFunction = 3, 
		RULE_let = 4, RULE_unlet = 5, RULE_continue_ = 6, RULE_break_ = 7, RULE_return_ = 8, 
		RULE_expression = 9, RULE_arithmetic = 10, RULE_primary = 11, RULE_echo = 12, 
		RULE_while_ = 13, RULE_ifelse = 14, RULE_else_ = 15, RULE_elseif = 16, 
		RULE_literal = 17, RULE_callFunction = 18, RULE_listLiteral = 19, RULE_dictionaryLiteral = 20, 
		RULE_keyValue = 21;
	public static final String[] ruleNames = {
		"allStatement", "statements", "for_", "creationFunction", "let", "unlet", 
		"continue_", "break_", "return_", "expression", "arithmetic", "primary", 
		"echo", "while_", "ifelse", "else_", "elseif", "literal", "callFunction", 
		"listLiteral", "dictionaryLiteral", "keyValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'function!'", "'('", "','", "')'", "'^'", "'|'", "'?'", 
		"'%'", "'!='", "'&&'", "'||'", "'['", "']'", "'{'", "'}'", "'=='", "'<='", 
		"'>='", "'!'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'let'", "'unlet'", "'return'", "'function'", 
		"'endfunction'", "'if'", "'endif'", "'else'", "'elseif'", "'continue'", 
		"'break'", "'while'", "'endwhile'", "'for'", "'in'", "'endfor'", "'echo'", 
		"'call'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "EQUAL", "LE", "GE", "BANG", "ASSIGN", "GT", 
		"LT", "ADD", "SUB", "MUL", "DIV", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "LET", "UNLET", "RETURN", "FUNCTION", "ENDFUNCTION", 
		"IF", "ENDIF", "ELSE", "ELSEIF", "CONTINUE", "BREAK", "WHILE", "ENDWHILE", 
		"FOR", "In", "ENDFOR", "ECHO", "CALL", "FloatLiteral", "IntegerLiteral", 
		"StringLiteral", "IdLiteral", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "VimScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VimScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AllStatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VimScriptParser.EOF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public AllStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterAllStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitAllStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitAllStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllStatementContext allStatement() throws RecognitionException {
		AllStatementContext _localctx = new AllStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_allStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << ADD) | (1L << SUB) | (1L << LET) | (1L << UNLET) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << CONTINUE) | (1L << BREAK) | (1L << WHILE) | (1L << FOR) | (1L << ECHO) | (1L << CALL) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << IdLiteral))) != 0)) {
				{
				{
				setState(44);
				statements();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public EchoContext echo() {
			return getRuleContext(EchoContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public Continue_Context continue_() {
			return getRuleContext(Continue_Context.class,0);
		}
		public UnletContext unlet() {
			return getRuleContext(UnletContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CreationFunctionContext creationFunction() {
			return getRuleContext(CreationFunctionContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(52);
					match(T__0);
					}
				}

				setState(55);
				let();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(56);
					match(T__0);
					}
				}

				setState(59);
				ifelse();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(60);
					match(T__0);
					}
				}

				setState(63);
				match(ENDIF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(65);
					match(T__0);
					}
				}

				setState(68);
				while_();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(69);
					match(T__0);
					}
				}

				setState(72);
				match(ENDWHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(74);
					match(T__0);
					}
				}

				setState(77);
				for_();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(78);
					match(T__0);
					}
				}

				setState(81);
				match(ENDFOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(83);
					match(T__0);
					}
				}

				setState(86);
				echo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(87);
					match(T__0);
					}
				}

				setState(90);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(91);
					match(T__0);
					}
				}

				setState(94);
				break_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(95);
					match(T__0);
					}
				}

				setState(98);
				continue_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(99);
					match(T__0);
					}
				}

				setState(102);
				unlet();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(103);
					match(T__0);
					}
				}

				setState(106);
				expression(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(107);
					match(T__0);
					}
				}

				setState(110);
				match(CALL);
				setState(111);
				callFunction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(112);
					match(T__0);
					}
				}

				setState(115);
				creationFunction();
				setState(116);
				match(ENDFUNCTION);
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

	public static class For_Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_for_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOR);
			setState(121);
			expression(0);
			setState(122);
			match(In);
			setState(123);
			expression(0);
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CreationFunctionContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> IdLiteral() { return getTokens(VimScriptParser.IdLiteral); }
		public TerminalNode IdLiteral(int i) {
			return getToken(VimScriptParser.IdLiteral, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public CreationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterCreationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitCreationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitCreationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreationFunctionContext creationFunction() throws RecognitionException {
		CreationFunctionContext _localctx = new CreationFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_creationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((CreationFunctionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==FUNCTION) ) {
				((CreationFunctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			match(IdLiteral);
			setState(131);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdLiteral) {
				{
				setState(132);
				match(IdLiteral);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(133);
					match(T__3);
					setState(134);
					match(IdLiteral);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(T__4);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << ADD) | (1L << SUB) | (1L << LET) | (1L << UNLET) | (1L << RETURN) | (1L << FUNCTION) | (1L << IF) | (1L << CONTINUE) | (1L << BREAK) | (1L << WHILE) | (1L << FOR) | (1L << ECHO) | (1L << CALL) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << IdLiteral))) != 0)) {
				{
				{
				setState(143);
				statements();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LetContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LET);
			setState(150);
			expression(0);
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

	public static class UnletContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterUnlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitUnlet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitUnlet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnletContext unlet() throws RecognitionException {
		UnletContext _localctx = new UnletContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(UNLET);
			setState(153);
			expression(0);
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

	public static class Continue_Context extends ParserRuleContext {
		public Continue_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterContinue_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitContinue_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitContinue_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_Context continue_() throws RecognitionException {
		Continue_Context _localctx = new Continue_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_continue_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CONTINUE);
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

	public static class Break_Context extends ParserRuleContext {
		public Break_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterBreak_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitBreak_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitBreak_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_Context break_() throws RecognitionException {
		Break_Context _localctx = new Break_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_break_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(BREAK);
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

	public static class Return_Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(RETURN);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(160);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token sign;
		public Token op;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(164);
				primary();
				}
				break;
			case 2:
				{
				setState(165);
				arithmetic(0);
				}
				break;
			case 3:
				{
				setState(166);
				((ExpressionContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((ExpressionContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
						match(T__5);
						setState(172);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(T__6);
						setState(175);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(T__7);
						setState(178);
						expression(0);
						setState(179);
						match(T__0);
						setState(180);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(183);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOrContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public AndOrContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public AddSubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticLiteralContext extends ArithmeticContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArithmeticLiteralContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterArithmeticLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitArithmeticLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitArithmeticLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public LogicContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticParenContext extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithmeticParenContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterArithmeticParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitArithmeticParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitArithmeticParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public MulDivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__14:
			case FloatLiteral:
			case IntegerLiteral:
			case StringLiteral:
			case IdLiteral:
				{
				_localctx = new ArithmeticLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				literal();
				}
				break;
			case T__2:
				{
				_localctx = new ArithmeticParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__2);
				setState(193);
				arithmetic(0);
				setState(194);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						arithmetic(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(202);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						arithmetic(6);
						}
						break;
					case 3:
						{
						_localctx = new LogicContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						((LogicContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						arithmetic(5);
						}
						break;
					case 4:
						{
						_localctx = new AndOrContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primary);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__2);
				setState(216);
				expression(0);
				setState(217);
				match(T__4);
				}
				break;
			case T__12:
			case T__14:
			case FloatLiteral:
			case IntegerLiteral:
			case StringLiteral:
			case IdLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				literal();
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

	public static class EchoContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterEcho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitEcho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitEcho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoContext echo() throws RecognitionException {
		EchoContext _localctx = new EchoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_echo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ECHO);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					expression(0);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class While_Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(WHILE);
			setState(230);
			expression(0);
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(231);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IfelseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifelse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IF);
			setState(237);
			expression(0);
			setState(239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(238);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(243);
				else_();
				}
				break;
			case ELSEIF:
				{
				setState(244);
				elseif();
				}
				break;
			case T__0:
			case ENDIF:
				break;
			default:
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

	public static class Else_Context extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ELSE);
			setState(249); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(248);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(251); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElseifContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ELSEIF);
			setState(254);
			expression(0);
			setState(256); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(255);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(260);
				else_();
				}
				break;
			case ELSEIF:
				{
				setState(261);
				elseif();
				}
				break;
			case T__0:
			case ENDIF:
				break;
			default:
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(VimScriptParser.StringLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(VimScriptParser.FloatLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(VimScriptParser.IntegerLiteral, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode IdLiteral() { return getToken(VimScriptParser.IdLiteral, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public DictionaryLiteralContext dictionaryLiteral() {
			return getRuleContext(DictionaryLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(FloatLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(IntegerLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				callFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(IdLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				listLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				dictionaryLiteral();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode IdLiteral() { return getToken(VimScriptParser.IdLiteral, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IdLiteral);
			setState(274);
			match(T__2);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << ADD) | (1L << SUB) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << IdLiteral))) != 0)) {
				{
				setState(275);
				expression(0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(276);
					match(T__3);
					setState(277);
					expression(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
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

	public static class ListLiteralContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__12);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << FloatLiteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << IdLiteral))) != 0)) {
				{
				setState(288);
				literal();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(289);
					match(T__3);
					setState(290);
					literal();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(298);
			match(T__13);
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

	public static class DictionaryLiteralContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public DictionaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterDictionaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitDictionaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitDictionaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryLiteralContext dictionaryLiteral() throws RecognitionException {
		DictionaryLiteralContext _localctx = new DictionaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dictionaryLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__14);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(301);
				keyValue();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(302);
					match(T__3);
					setState(303);
					keyValue();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311);
			match(T__15);
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

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(VimScriptParser.StringLiteral, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VimScriptListener ) ((VimScriptListener)listener).exitKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VimScriptVisitor ) return ((VimScriptVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(StringLiteral);
			setState(314);
			match(T__0);
			setState(315);
			literal();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\5\38\n\3\3\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3\3"+
		"\3\3\3\3\3\5\3E\n\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\5\3"+
		"R\n\3\3\3\3\3\3\3\5\3W\n\3\3\3\3\3\5\3[\n\3\3\3\3\3\5\3_\n\3\3\3\3\3\5"+
		"\3c\n\3\3\3\3\3\5\3g\n\3\3\3\3\3\5\3k\n\3\3\3\3\3\5\3o\n\3\3\3\3\3\3\3"+
		"\5\3t\n\3\3\3\3\3\3\3\5\3y\n\3\3\4\3\4\3\4\3\4\3\4\6\4\u0080\n\4\r\4\16"+
		"\4\u0081\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\5\5"+
		"\u008f\n\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ab\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00c7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00df"+
		"\n\r\3\16\3\16\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16\3\17\3\17\3\17\6"+
		"\17\u00eb\n\17\r\17\16\17\u00ec\3\20\3\20\3\20\6\20\u00f2\n\20\r\20\16"+
		"\20\u00f3\3\20\3\20\5\20\u00f8\n\20\3\21\3\21\6\21\u00fc\n\21\r\21\16"+
		"\21\u00fd\3\22\3\22\3\22\6\22\u0103\n\22\r\22\16\22\u0104\3\22\3\22\5"+
		"\22\u0109\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0112\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\5\24\u011e"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0126\n\25\f\25\16\25\u0129\13"+
		"\25\5\25\u012b\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0133\n\26\f\26"+
		"\16\26\u0136\13\26\5\26\u0138\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\2\4\24\26\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\b\4\2\4"+
		"\4&&\3\2\32\33\4\2\27\27\36\"\4\2\13\13\34\35\5\2\f\f\23\25\30\31\3\2"+
		"\r\16\2\u016a\2\61\3\2\2\2\4x\3\2\2\2\6z\3\2\2\2\b\u0083\3\2\2\2\n\u0097"+
		"\3\2\2\2\f\u009a\3\2\2\2\16\u009d\3\2\2\2\20\u009f\3\2\2\2\22\u00a1\3"+
		"\2\2\2\24\u00aa\3\2\2\2\26\u00c6\3\2\2\2\30\u00de\3\2\2\2\32\u00e0\3\2"+
		"\2\2\34\u00e7\3\2\2\2\36\u00ee\3\2\2\2 \u00f9\3\2\2\2\"\u00ff\3\2\2\2"+
		"$\u0111\3\2\2\2&\u0113\3\2\2\2(\u0121\3\2\2\2*\u012e\3\2\2\2,\u013b\3"+
		"\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\668\7\3\2\2\67\66"+
		"\3\2\2\2\678\3\2\2\289\3\2\2\29y\5\n\6\2:<\7\3\2\2;:\3\2\2\2;<\3\2\2\2"+
		"<=\3\2\2\2=?\5\36\20\2>@\7\3\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7)\2"+
		"\2By\3\2\2\2CE\7\3\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\5\34\17\2GI\7\3"+
		"\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7/\2\2Ky\3\2\2\2LN\7\3\2\2ML\3\2"+
		"\2\2MN\3\2\2\2NO\3\2\2\2OQ\5\6\4\2PR\7\3\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7\62\2\2Ty\3\2\2\2UW\7\3\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xy\5"+
		"\32\16\2Y[\7\3\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\y\5\22\n\2]_\7\3\2"+
		"\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`y\5\20\t\2ac\7\3\2\2ba\3\2\2\2bc\3\2"+
		"\2\2cd\3\2\2\2dy\5\16\b\2eg\7\3\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hy\5"+
		"\f\7\2ik\7\3\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2ly\5\24\13\2mo\7\3\2\2n"+
		"m\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\64\2\2qy\5&\24\2rt\7\3\2\2sr\3\2\2\2"+
		"st\3\2\2\2tu\3\2\2\2uv\5\b\5\2vw\7\'\2\2wy\3\2\2\2x\67\3\2\2\2x;\3\2\2"+
		"\2xD\3\2\2\2xM\3\2\2\2xV\3\2\2\2xZ\3\2\2\2x^\3\2\2\2xb\3\2\2\2xf\3\2\2"+
		"\2xj\3\2\2\2xn\3\2\2\2xs\3\2\2\2y\5\3\2\2\2z{\7\60\2\2{|\5\24\13\2|}\7"+
		"\61\2\2}\177\5\24\13\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0084\t\2"+
		"\2\2\u0084\u0085\78\2\2\u0085\u008e\7\5\2\2\u0086\u008b\78\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\u008a\78\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0094\7\7\2\2\u0091\u0093\5\4\3\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\t\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\5\24\13\2\u0099\13\3\2\2\2\u009a"+
		"\u009b\7$\2\2\u009b\u009c\5\24\13\2\u009c\r\3\2\2\2\u009d\u009e\7,\2\2"+
		"\u009e\17\3\2\2\2\u009f\u00a0\7-\2\2\u00a0\21\3\2\2\2\u00a1\u00a3\7%\2"+
		"\2\u00a2\u00a4\5\24\13\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00a6\b\13\1\2\u00a6\u00ab\5\30\r\2\u00a7\u00ab\5\26"+
		"\f\2\u00a8\u00a9\t\3\2\2\u00a9\u00ab\5\24\13\7\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00bd\3\2\2\2\u00ac\u00ad\f\6"+
		"\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00bc\5\24\13\7\u00af\u00b0\f\5\2\2\u00b0"+
		"\u00b1\7\t\2\2\u00b1\u00bc\5\24\13\6\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7"+
		"\n\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5\24\13\5"+
		"\u00b7\u00bc\3\2\2\2\u00b8\u00b9\f\3\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bc"+
		"\5\24\13\4\u00bb\u00ac\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2"+
		"\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\f\1\2\u00c1"+
		"\u00c7\5$\23\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\26\f\2\u00c4\u00c5\7"+
		"\7\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7"+
		"\u00d6\3\2\2\2\u00c8\u00c9\f\b\2\2\u00c9\u00ca\t\5\2\2\u00ca\u00d5\5\26"+
		"\f\t\u00cb\u00cc\f\7\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00d5\5\26\f\b\u00ce"+
		"\u00cf\f\6\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00d5\5\26\f\7\u00d1\u00d2\f"+
		"\5\2\2\u00d2\u00d3\t\7\2\2\u00d3\u00d5\5\26\f\6\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\7\7\2\2"+
		"\u00dc\u00df\3\2\2\2\u00dd\u00df\5$\23\2\u00de\u00d9\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e4\7\63\2\2\u00e1\u00e3\5\24\13\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\33\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8\u00ea"+
		"\5\24\13\2\u00e9\u00eb\5\4\3\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ef"+
		"\7(\2\2\u00ef\u00f1\5\24\13\2\u00f0\u00f2\5\4\3\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f8\5 \21\2\u00f6\u00f8\5\"\22\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fb"+
		"\7*\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0100\7+\2\2\u0100"+
		"\u0102\5\24\13\2\u0101\u0103\5\4\3\2\u0102\u0101\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0109\5 \21\2\u0107\u0109\5\"\22\2\u0108\u0106\3\2\2\2\u0108\u0107\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109#\3\2\2\2\u010a\u0112\7\67\2\2\u010b\u0112"+
		"\7\65\2\2\u010c\u0112\7\66\2\2\u010d\u0112\5&\24\2\u010e\u0112\78\2\2"+
		"\u010f\u0112\5(\25\2\u0110\u0112\5*\26\2\u0111\u010a\3\2\2\2\u0111\u010b"+
		"\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112%\3\2\2\2\u0113\u0114\78\2\2\u0114"+
		"\u011d\7\5\2\2\u0115\u011a\5\24\13\2\u0116\u0117\7\6\2\2\u0117\u0119\5"+
		"\24\13\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\7\2\2\u0120"+
		"\'\3\2\2\2\u0121\u012a\7\17\2\2\u0122\u0127\5$\23\2\u0123\u0124\7\6\2"+
		"\2\u0124\u0126\5$\23\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\20"+
		"\2\2\u012d)\3\2\2\2\u012e\u0137\7\21\2\2\u012f\u0134\5,\27\2\u0130\u0131"+
		"\7\6\2\2\u0131\u0133\5,\27\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u012f\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\7\22\2\2\u013a+\3\2\2\2\u013b\u013c\7\67\2\2\u013c\u013d\7\3\2"+
		"\2\u013d\u013e\5$\23\2\u013e-\3\2\2\2-\61\67;?DHMQVZ^bfjnsx\u0081\u008b"+
		"\u008e\u0094\u00a3\u00aa\u00bb\u00bd\u00c6\u00d4\u00d6\u00de\u00e4\u00ec"+
		"\u00f3\u00f7\u00fd\u0104\u0108\u0111\u011a\u011d\u0127\u012a\u0134\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}