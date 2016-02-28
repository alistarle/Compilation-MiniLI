package parser;// Generated from /media/thomas/5E197C420C4B9AFF/Compilation/Projet/src/Minili.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Int=11, Boolean=12, Char=13, Void=14, ADD=15, SUB=16, MUL=17, 
		DIV=18, GT=19, GTE=20, LT=21, LTE=22, EQ=23, NEQ=24, AND=25, OR=26, NOT=27, 
		IF=28, ELSE=29, WHILE=30, GLOBAL=31, RETURN=32, Constante=33, Identifiant=34, 
		BOOLEAN=35, CHAR=36, WS=37;
	public static final int
		RULE_minili = 0, RULE_type = 1, RULE_global = 2, RULE_affectation = 3, 
		RULE_function = 4, RULE_functionCall = 5, RULE_instruction = 6, RULE_ret = 7, 
		RULE_instructionList = 8, RULE_controle = 9, RULE_expression = 10;
	public static final String[] ruleNames = {
		"minili", "type", "global", "affectation", "function", "functionCall", 
		"instruction", "ret", "instructionList", "controle", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'='", "'('", "'&'", "','", "')'", "'{'", "'}'", 
		"'int'", "'boolean'", "'char'", "'void'", "'+'", "'-'", "'*'", "'/'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'if'", 
		"'else'", "'while'", "'global'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Int", 
		"Boolean", "Char", "Void", "ADD", "SUB", "MUL", "DIV", "GT", "GTE", "LT", 
		"LTE", "EQ", "NEQ", "AND", "OR", "NOT", "IF", "ELSE", "WHILE", "GLOBAL", 
		"RETURN", "Constante", "Identifiant", "BOOLEAN", "CHAR", "WS"
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
	public String getGrammarFileName() { return "Minili.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MiniliContext extends ParserRuleContext {
		public MiniliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minili; }
	 
		public MiniliContext() { }
		public void copyFrom(MiniliContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends MiniliContext {
		public TerminalNode EOF() { return getToken(MiniliParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public ProgramContext(MiniliContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiniliContext minili() throws RecognitionException {
		MiniliContext _localctx = new MiniliContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_minili);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void) | (1L << GLOBAL))) != 0)) {
				{
				setState(24);
				switch (_input.LA(1)) {
				case Int:
				case Boolean:
				case Char:
				case Void:
					{
					setState(22);
					function();
					}
					break;
				case GLOBAL:
					{
					setState(23);
					global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MiniliParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(MiniliParser.Boolean, 0); }
		public TerminalNode Char() { return getToken(MiniliParser.Char, 0); }
		public TerminalNode Void() { return getToken(MiniliParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(MiniliParser.GLOBAL, 0); }
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(GLOBAL);
			setState(34);
			affectation();
			setState(35);
			match(T__0);
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

	public static class AffectationContext extends ParserRuleContext {
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	 
		public AffectationContext() { }
		public void copyFrom(AffectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpContext extends AffectationContext {
		public TerminalNode Identifiant() { return getToken(MiniliParser.Identifiant, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MiniliParser.SUB, 0); }
		public AssignExpContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareTabContext extends AffectationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifiant() { return getTokens(MiniliParser.Identifiant); }
		public TerminalNode Identifiant(int i) {
			return getToken(MiniliParser.Identifiant, i);
		}
		public TerminalNode Constante() { return getToken(MiniliParser.Constante, 0); }
		public DeclareTabContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterDeclareTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitDeclareTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitDeclareTab(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignTabExpContext extends AffectationContext {
		public TerminalNode Identifiant() { return getToken(MiniliParser.Identifiant, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignTabExpContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterAssignTabExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitAssignTabExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitAssignTabExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareVarContext extends AffectationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifiant() { return getToken(MiniliParser.Identifiant, 0); }
		public DeclareVarContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterDeclareVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitDeclareVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitDeclareVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_affectation);
		int _la;
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclareTabContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				type();
				setState(38);
				match(Identifiant);
				setState(39);
				match(T__1);
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==Constante || _la==Identifiant) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(41);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AssignTabExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(Identifiant);
				setState(44);
				match(T__1);
				setState(45);
				expression(0);
				setState(46);
				match(T__2);
				setState(47);
				match(T__3);
				setState(48);
				expression(0);
				}
				break;
			case 3:
				_localctx = new AssignExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void))) != 0)) {
					{
					setState(50);
					type();
					}
				}

				setState(53);
				match(Identifiant);
				setState(54);
				match(T__3);
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(55);
					match(SUB);
					}
					break;
				}
				setState(58);
				expression(0);
				}
				break;
			case 4:
				_localctx = new DeclareVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				type();
				setState(60);
				match(Identifiant);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifiant() { return getTokens(MiniliParser.Identifiant); }
		public TerminalNode Identifiant(int i) {
			return getToken(MiniliParser.Identifiant, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(Identifiant);
			setState(66);
			match(T__4);
			setState(73);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void))) != 0)) {
				{
				setState(68);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(67);
					match(T__5);
					}
				}

				setState(70);
				type();
				setState(71);
				match(Identifiant);
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					match(T__6);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(80);
						match(T__5);
						}
					}

					setState(83);
					type();
					setState(84);
					match(Identifiant);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void))) != 0) );
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__7);
			setState(96);
			match(T__8);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					instruction();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(104);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(103);
				ret();
				}
			}

			setState(106);
			match(T__9);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> Identifiant() { return getTokens(MiniliParser.Identifiant); }
		public TerminalNode Identifiant(int i) {
			return getToken(MiniliParser.Identifiant, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(108);
					affectation();
					}
					break;
				case 2:
					{
					setState(109);
					match(Identifiant);
					}
					break;
				}
				setState(112);
				match(T__3);
				}
				break;
			}
			setState(115);
			match(Identifiant);
			setState(116);
			match(T__4);
			setState(121);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void) | (1L << SUB) | (1L << NOT) | (1L << Constante) | (1L << Identifiant) | (1L << BOOLEAN) | (1L << CHAR))) != 0)) {
				{
				setState(118);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(117);
					match(T__5);
					}
				}

				setState(120);
				expression(0);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					match(T__6);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(128);
						match(T__5);
						}
					}

					setState(131);
					expression(0);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void) | (1L << SUB) | (1L << NOT) | (1L << Constante) | (1L << Identifiant) | (1L << BOOLEAN) | (1L << CHAR))) != 0) );
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__7);
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

	public static class InstructionContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				affectation();
				setState(144);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				functionCall();
				setState(147);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				controle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				ret();
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

	public static class RetContext extends ParserRuleContext {
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
	 
		public RetContext() { }
		public void copyFrom(RetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpContext extends RetContext {
		public TerminalNode RETURN() { return getToken(MiniliParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpContext(RetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnOnlyContext extends RetContext {
		public TerminalNode RETURN() { return getToken(MiniliParser.RETURN, 0); }
		public ReturnOnlyContext(RetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterReturnOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitReturnOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitReturnOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ret);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(RETURN);
				setState(154);
				expression(0);
				setState(155);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ReturnOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(RETURN);
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

	public static class InstructionListContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterInstructionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitInstructionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitInstructionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		InstructionListContext _localctx = new InstructionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instructionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << Identifiant))) != 0)) {
				{
				{
				setState(160);
				instruction();
				}
				}
				setState(165);
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

	public static class ControleContext extends ParserRuleContext {
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	 
		public ControleContext() { }
		public void copyFrom(ControleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ControleIfContext extends ControleContext {
		public TerminalNode IF() { return getToken(MiniliParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionListContext> instructionList() {
			return getRuleContexts(InstructionListContext.class);
		}
		public InstructionListContext instructionList(int i) {
			return getRuleContext(InstructionListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniliParser.ELSE, 0); }
		public ControleIfContext(ControleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterControleIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitControleIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitControleIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ControleWhileContext extends ControleContext {
		public TerminalNode WHILE() { return getToken(MiniliParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ControleWhileContext(ControleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterControleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitControleWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitControleWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controle);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new ControleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(IF);
				setState(167);
				match(T__4);
				setState(168);
				expression(0);
				setState(169);
				match(T__7);
				setState(170);
				match(T__8);
				setState(171);
				instructionList();
				setState(172);
				match(T__9);
				setState(178);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(173);
					match(ELSE);
					setState(174);
					match(T__8);
					setState(175);
					instructionList();
					setState(176);
					match(T__9);
					}
				}

				}
				break;
			case WHILE:
				_localctx = new ControleWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(WHILE);
				setState(181);
				match(T__4);
				setState(182);
				expression(0);
				setState(183);
				match(T__7);
				setState(184);
				match(T__8);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Boolean) | (1L << Char) | (1L << Void) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << Identifiant))) != 0)) {
					{
					{
					setState(185);
					instruction();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__9);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MiniliParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniliParser.DIV, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MiniliParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MiniliParser.SUB, 0); }
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterExpFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitExpFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitExpFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdArrayContext extends ExpressionContext {
		public TerminalNode Identifiant() { return getToken(MiniliParser.Identifiant, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterIdArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitIdArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitIdArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode Constante() { return getToken(MiniliParser.Constante, 0); }
		public TerminalNode SUB() { return getToken(MiniliParser.SUB, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(MiniliParser.GT, 0); }
		public TerminalNode GTE() { return getToken(MiniliParser.GTE, 0); }
		public TerminalNode LT() { return getToken(MiniliParser.LT, 0); }
		public TerminalNode LTE() { return getToken(MiniliParser.LTE, 0); }
		public CompContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicNotContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MiniliParser.NOT, 0); }
		public LogicNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitLogicNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitLogicNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MiniliParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MiniliParser.NEQ, 0); }
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(MiniliParser.CHAR, 0); }
		public CharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode Identifiant() { return getToken(MiniliParser.Identifiant, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MiniliParser.BOOLEAN, 0); }
		public BooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniliParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniliParser.OR, 0); }
		public LogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniliListener ) ((MiniliListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniliVisitor) return ((MiniliVisitor<? extends T>)visitor).visitLogic(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				((LogicNotContext)_localctx).op = match(NOT);
				setState(197);
				expression(8);
				}
				break;
			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(Identifiant);
				}
				break;
			case 3:
				{
				_localctx = new IdArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(Identifiant);
				setState(200);
				match(T__1);
				setState(201);
				expression(0);
				setState(202);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(CHAR);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(206);
					match(SUB);
					}
				}

				setState(209);
				match(Constante);
				}
				break;
			case 7:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__4);
				setState(211);
				expression(0);
				setState(212);
				match(T__7);
				}
				break;
			case 8:
				{
				_localctx = new ExpFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(218);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(219);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(221);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(222);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new CompContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(224);
						((CompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
							((CompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(225);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(227);
						((EqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(228);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(230);
						((LogicContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(231);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\66\n\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6"+
		"\5\6G\n\6\3\6\3\6\3\6\5\6L\n\6\3\6\6\6O\n\6\r\6\16\6P\3\6\5\6T\n\6\3\6"+
		"\3\6\3\6\6\6Y\n\6\r\6\16\6Z\7\6]\n\6\f\6\16\6`\13\6\3\6\3\6\3\6\7\6e\n"+
		"\6\f\6\16\6h\13\6\3\6\5\6k\n\6\3\6\3\6\3\7\3\7\5\7q\n\7\3\7\5\7t\n\7\3"+
		"\7\3\7\3\7\5\7y\n\7\3\7\5\7|\n\7\3\7\6\7\177\n\7\r\7\16\7\u0080\3\7\5"+
		"\7\u0084\n\7\3\7\6\7\u0087\n\7\r\7\16\7\u0088\7\7\u008b\n\7\f\7\16\7\u008e"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00a1\n\t\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bd\n\13\f\13\16\13\u00c0\13\13"+
		"\3\13\3\13\5\13\u00c4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00d2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00da\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f"+
		"\u00ee\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\t\3\2\r\20\3\2#"+
		"$\3\2\23\24\3\2\21\22\3\2\25\30\3\2\31\32\3\2\33\34\u0110\2\34\3\2\2\2"+
		"\4!\3\2\2\2\6#\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fs\3\2\2\2\16\u0099\3\2\2"+
		"\2\20\u00a0\3\2\2\2\22\u00a5\3\2\2\2\24\u00c3\3\2\2\2\26\u00d9\3\2\2\2"+
		"\30\33\5\n\6\2\31\33\5\6\4\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2"+
		"\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 "+
		"\3\3\2\2\2!\"\t\2\2\2\"\5\3\2\2\2#$\7!\2\2$%\5\b\5\2%&\7\3\2\2&\7\3\2"+
		"\2\2\'(\5\4\3\2()\7$\2\2)*\7\4\2\2*+\t\3\2\2+,\7\5\2\2,A\3\2\2\2-.\7$"+
		"\2\2./\7\4\2\2/\60\5\26\f\2\60\61\7\5\2\2\61\62\7\6\2\2\62\63\5\26\f\2"+
		"\63A\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		"8\7$\2\28:\7\6\2\29;\7\22\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<A\5\26\f\2"+
		"=>\5\4\3\2>?\7$\2\2?A\3\2\2\2@\'\3\2\2\2@-\3\2\2\2@\65\3\2\2\2@=\3\2\2"+
		"\2A\t\3\2\2\2BC\5\4\3\2CD\7$\2\2DK\7\7\2\2EG\7\b\2\2FE\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HI\5\4\3\2IJ\7$\2\2JL\3\2\2\2KF\3\2\2\2KL\3\2\2\2L^\3\2\2"+
		"\2MO\7\t\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QX\3\2\2\2RT\7\b\2"+
		"\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5\4\3\2VW\7$\2\2WY\3\2\2\2XS\3\2\2"+
		"\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\N\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\n\2\2bf\7\13\2\2ce\5\16\b\2dc\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\5\20\t\2ji"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\f\2\2m\13\3\2\2\2nq\5\b\5\2oq\7$\2\2"+
		"pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rt\7\6\2\2sp\3\2\2\2st\3\2\2\2tu\3\2\2\2"+
		"uv\7$\2\2v{\7\7\2\2wy\7\b\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\5\26\f\2"+
		"{x\3\2\2\2{|\3\2\2\2|\u008c\3\2\2\2}\177\7\t\2\2~}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0084"+
		"\7\b\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\5\26\f\2\u0086\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a~\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\n\2\2\u0090\r\3\2\2\2\u0091\u0092\5\b\5\2"+
		"\u0092\u0093\7\3\2\2\u0093\u009a\3\2\2\2\u0094\u0095\5\f\7\2\u0095\u0096"+
		"\7\3\2\2\u0096\u009a\3\2\2\2\u0097\u009a\5\24\13\2\u0098\u009a\5\20\t"+
		"\2\u0099\u0091\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c\7\"\2\2\u009c\u009d\5\26\f\2\u009d"+
		"\u009e\7\3\2\2\u009e\u00a1\3\2\2\2\u009f\u00a1\7\"\2\2\u00a0\u009b\3\2"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a4\5\16\b\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\23\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\7\7\2"+
		"\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\7\13\2\2\u00ad"+
		"\u00ae\5\22\n\2\u00ae\u00b4\7\f\2\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\7"+
		"\13\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\7\f\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00af\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c4\3\2\2\2\u00b6\u00b7\7 "+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\7\n\2\2\u00ba"+
		"\u00be\7\13\2\2\u00bb\u00bd\5\16\b\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00a8\3\2"+
		"\2\2\u00c3\u00b6\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c6\b\f\1\2\u00c6\u00c7"+
		"\7\35\2\2\u00c7\u00da\5\26\f\n\u00c8\u00da\7$\2\2\u00c9\u00ca\7$\2\2\u00ca"+
		"\u00cb\7\4\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\5\2\2\u00cd\u00da\3"+
		"\2\2\2\u00ce\u00da\7%\2\2\u00cf\u00da\7&\2\2\u00d0\u00d2\7\22\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00da\7#"+
		"\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\7\n\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00da\5\f\7\2\u00d9\u00c5\3\2\2\2\u00d9\u00c8\3\2"+
		"\2\2\u00d9\u00c9\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9"+
		"\u00d1\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00ec\3\2"+
		"\2\2\u00db\u00dc\f\17\2\2\u00dc\u00dd\t\4\2\2\u00dd\u00eb\5\26\f\20\u00de"+
		"\u00df\f\16\2\2\u00df\u00e0\t\5\2\2\u00e0\u00eb\5\26\f\17\u00e1\u00e2"+
		"\f\r\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00eb\5\26\f\16\u00e4\u00e5\f\f\2\2"+
		"\u00e5\u00e6\t\7\2\2\u00e6\u00eb\5\26\f\r\u00e7\u00e8\f\13\2\2\u00e8\u00e9"+
		"\t\b\2\2\u00e9\u00eb\5\26\f\f\u00ea\u00db\3\2\2\2\u00ea\u00de\3\2\2\2"+
		"\u00ea\u00e1\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2!\32\34\65:@FKPSZ^fjpsx{\u0080\u0083\u0088\u008c\u0099\u00a0"+
		"\u00a5\u00b4\u00be\u00c3\u00d1\u00d9\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}