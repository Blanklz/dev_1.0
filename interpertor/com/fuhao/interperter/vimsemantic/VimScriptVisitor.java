// Generated from E:/YSI/CodePlatform/interpertor/com/fuhao/interperter/vimsemantic\VimScript.g4 by ANTLR 4.7
package com.fuhao.interperter.vimsemantic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VimScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VimScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#allStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllStatement(VimScriptParser.AllStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(VimScriptParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(VimScriptParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#creationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationFunction(VimScriptParser.CreationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(VimScriptParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#unlet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlet(VimScriptParser.UnletContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#continue_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_(VimScriptParser.Continue_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#break_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_(VimScriptParser.Break_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(VimScriptParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VimScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(VimScriptParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(VimScriptParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticLiteral(VimScriptParser.ArithmeticLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(VimScriptParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticParen}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticParen(VimScriptParser.ArithmeticParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link VimScriptParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(VimScriptParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(VimScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#echo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho(VimScriptParser.EchoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(VimScriptParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(VimScriptParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(VimScriptParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(VimScriptParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VimScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(VimScriptParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(VimScriptParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryLiteral(VimScriptParser.DictionaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VimScriptParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(VimScriptParser.KeyValueContext ctx);
}