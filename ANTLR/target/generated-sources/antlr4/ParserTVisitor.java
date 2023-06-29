// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclaration(@NotNull ParserTParser.VardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull ParserTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#if_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_st(@NotNull ParserTParser.If_stContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ParserTParser.ProgramContext ctx);
}