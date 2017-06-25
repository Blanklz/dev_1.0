// Generated from E:/YSI/CodePlatform/interpertor/com/fuhao/interperter/vimsemantic\VimScript.g4 by ANTLR 4.7
package com.fuhao.interperter.vimsemantic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VimScriptParser}.
 */
public interface VimScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#allStatement}.
	 * @param ctx the parse tree
	 */
	void enterAllStatement(VimScriptParser.AllStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#allStatement}.
	 * @param ctx the parse tree
	 */
	void exitAllStatement(VimScriptParser.AllStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(VimScriptParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(VimScriptParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(VimScriptParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(VimScriptParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#creationFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreationFunction(VimScriptParser.CreationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#creationFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreationFunction(VimScriptParser.CreationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(VimScriptParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(VimScriptParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#unlet}.
	 * @param ctx the parse tree
	 */
	void enterUnlet(VimScriptParser.UnletContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#unlet}.
	 * @param ctx the parse tree
	 */
	void exitUnlet(VimScriptParser.UnletContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#continue_}.
	 * @param ctx the parse tree
	 */
	void enterContinue_(VimScriptParser.Continue_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#continue_}.
	 * @param ctx the parse tree
	 */
	void exitContinue_(VimScriptParser.Continue_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(VimScriptParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(VimScriptParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(VimScriptParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(VimScriptParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VimScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VimScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(VimScriptParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(VimScriptParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(VimScriptParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(VimScriptParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticLiteral(VimScriptParser.ArithmeticLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticLiteral(VimScriptParser.ArithmeticLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(VimScriptParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(VimScriptParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticParen}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticParen(VimScriptParser.ArithmeticParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticParen}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticParen(VimScriptParser.ArithmeticParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(VimScriptParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(VimScriptParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(VimScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(VimScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#echo}.
	 * @param ctx the parse tree
	 */
	void enterEcho(VimScriptParser.EchoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#echo}.
	 * @param ctx the parse tree
	 */
	void exitEcho(VimScriptParser.EchoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(VimScriptParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(VimScriptParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(VimScriptParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(VimScriptParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(VimScriptParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(VimScriptParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(VimScriptParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(VimScriptParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VimScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VimScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(VimScriptParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(VimScriptParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(VimScriptParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(VimScriptParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteral(VimScriptParser.DictionaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteral(VimScriptParser.DictionaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VimScriptParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(VimScriptParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VimScriptParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(VimScriptParser.KeyValueContext ctx);
}