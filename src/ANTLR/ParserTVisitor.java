package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
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
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#pasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasos(ParserTParser.PasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserTParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ParserTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(ParserTParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ParserTParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ParserTParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(ParserTParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(ParserTParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogica(ParserTParser.LogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ParserTParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#vardc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardc(ParserTParser.VardcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#desarrollo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesarrollo(ParserTParser.DesarrolloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#tan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(ParserTParser.TanContext ctx);
}