package MAIN;

import java.util.*;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.DesarrolloContext;
//import ANTLR.ParserTParser.StatementContext;
import ANTLR.ParserTParser.LogicaContext;

public class MyVisitor extends ParserTBaseVisitor<Integer> {

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);
	}

	// System.out.println(ctx.getText());
	// System.out.println(ctx.getChildCount());
	// System.out.println(ctx.getChild(2).getText());

	Map<String, String> variables = new HashMap<String, String>();

	@Override
	public Integer visitVardc(ParserTParser.VardcContext ctx) {
		String varname = ctx.getChild(0).getText();
		String value = ctx.getChild(2).getText();
		variables.put(varname, value);
		return visitChildren(ctx);
	}

	@Override 
	public Integer visitIncremento(ParserTParser.IncrementoContext ctx) { 
		String varName = ctx.getChild(0).getText();
		String value = ctx.getChild(1).getText();
		if (tokenName(ctx.getChild(0)).equals("Var")) {
			value = variables.get(varName);
		}

		float incremento = Float.parseFloat(value) + 1;
		variables.put(varName, Float.toString(incremento));

		return visitChildren(ctx); 
	}

	@Override
	public Integer visitPrint(ParserTParser.PrintContext ctx) {

		// Obtenemos lo que se necesita del print
		String cosaAMostrar = ctx.getChild(1).getText();

		// Comrpobamos el caso en el que sea un Var, porque se debe comportar distinto.
		// Cuidado que para comparar Strings en Java es recomendable usar el metodo
		// .equals()
		if (tokenName(ctx.getChild(1)).equals("Var")) {
			System.out.println(variables.get(cosaAMostrar));
		} else {
			System.out.println(cosaAMostrar);
		}

		return visitChildren(ctx);
	}

	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx) {
		String var = ctx.getChild(0).getText();
		String varLeft = ctx.getChild(2).getText();
		String varRight = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(2)).equals("Var")) {
			varLeft = variables.get(varLeft);
		}

		if (tokenName(ctx.getChild(4)).equals("Var")) {
			varRight = variables.get(varRight);
		}

		float suma = Float.parseFloat(varLeft) + Float.parseFloat(varRight);
		variables.put(var, Float.toString(suma));
		return visitChildren(ctx);
	}

	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx) {
		String var = ctx.getChild(0).getText();
		String varLeft = ctx.getChild(2).getText();
		String varRight = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(2)).equals("Var")) {
			varLeft = variables.get(varLeft);
		}

		if (tokenName(ctx.getChild(4)).equals("Var")) {
			varRight = variables.get(varRight);
		}

		float resta = Float.parseFloat(varLeft) - Float.parseFloat(varRight);
		variables.put(var, Float.toString(resta));
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx) {
		String var = ctx.getChild(0).getText();
		String varLeft = ctx.getChild(2).getText();
		String varRight = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(2)).equals("Var")) {
			varLeft = variables.get(varLeft);
		}

		if (tokenName(ctx.getChild(4)).equals("Var")) {
			varRight = variables.get(varRight);
		}

		float mult = Float.parseFloat(varLeft) * Float.parseFloat(varRight);
		variables.put(var, Float.toString(mult));

		return visitChildren(ctx);
	}

	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx) {
		String var = ctx.getChild(0).getText();
		String varLeft = ctx.getChild(2).getText();
		String varRight = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(2)).equals("Var")) {
			varLeft = variables.get(varLeft);
		}

		if (tokenName(ctx.getChild(4)).equals("Var")) {
			varRight = variables.get(varRight);
		}

		float div = Float.parseFloat(varLeft) / Float.parseFloat(varRight);
		variables.put(var, Float.toString(div));
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSin(ParserTParser.SinContext ctx) {
		String varName = ctx.getChild(0).getText();
		String value = ctx.getChild(4).getText();
		if (tokenName(ctx.getChild(4)).equals("Var")) {
			value = variables.get(value);
		}
		double sin = Math.sin(Double.parseDouble(value));
		variables.put(varName, Double.toString(sin));

		return visitChildren(ctx);
	}

	@Override
	public Integer visitCos(ParserTParser.CosContext ctx) {
		String varName = ctx.getChild(0).getText();
		String value = ctx.getChild(4).getText();
		if (tokenName(ctx.getChild(4)).equals("Var")) {
			value = variables.get(value);
		}
		double sin = Math.cos(Double.parseDouble(value));
		variables.put(varName, Double.toString(sin));

		return visitChildren(ctx);
	}

	@Override
	public Integer visitTan(ParserTParser.TanContext ctx) {
		String varName = ctx.getChild(0).getText();
		String value = ctx.getChild(4).getText();
		if (tokenName(ctx.getChild(4)).equals("Var")) {
			value = variables.get(value);
		}
		double sin = Math.tan(Double.parseDouble(value));
		variables.put(varName, Double.toString(sin));
		return visitChildren(ctx);
	}

	@Override public Integer visitLogica(ParserTParser.LogicaContext ctx) { 
		String operacion = ctx.getChild(0).getChild(2).getText();
		Integer value;
		if (operacion.equals(" Mayoht ")) {
			value = visitMa((MayorContext) ctx.getChild(0));
			// System.out.println("Value: "+value);
			return value;
		}
		if (operacion.equals(" Menhok ")) {
			value = visitMenor((MenorContext) ctx.getChild(0));
			// System.out.println("Value: "+value);
			return value;
		}
		if (operacion.equals(" Ekval ")) {
			value = visitIgual((IgualContext) ctx.getChild(0));
			// System.out.println("Value: "+value);
			return value;
		}
		return 0;
		return visitChildren(ctx); 
	}


	@Override
	public Integer visitSi(ParserTParser.SiContext ctx) {
		// System.out.println(ctx.getChild(7).getText());
		String condicion = ctx.getChild(3).getText();
		String variable1 = variables.get(ctx.getChild(2).getText());
		String variable2 = ctx.getChild(4).getText();
		int num1 = 0;
		int num2 = 0;

		try {

			num1 = Integer.parseInt(variable1);
			num2 = Integer.parseInt(variable2);
		} catch (Exception e) {
			// System.out.println("Error en la condicion");
		}

		try {
			// float num1f = Float.parseFloat(variable1);
			// float num2f = Float.parseFloat(variable2);
		} catch (Exception e) {
			// System.out.println("Error en la condicion");
		}

		try {
			switch (condicion) {
				case "==":
					if (num1 == num2) {
						// System.out.println(ctx.getChild(6).getText());
					}
					break;
				case ">":
					if (num1 > num2) {
						System.out.println(ctx.getChild(6).getText());
					}
					break;
				case "<":
					if (num1 < num2) {
						System.out.println(ctx.getChild(6).getText());
					}
					break;
				default:
					System.out.println("Error en la condicion");
					break;
			}
		} catch (Exception e) {
			System.out.println("Error en la condicion");
		}
		// float suma = Float.parseFloat(varLeft) + Float.parseFloat(varRight);
		// var = variables.put(var, Float.toString(suma));

		return visitChildren(ctx);
		// Verificar hasta "}" con un ciclo

	}



	@Override public Integer visitMientras(ParserTParser.MientrasContext ctx) { 
		List<Object> list = new ArrayList<>();

		// Almacenar la el Cuerpo
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (tokenName(ctx.getChild(i)).equals("desarrollo")) {
				// System.out.println("Cuerpo: "+ctx.getChild(i).getText());
				list.add(ctx.getChild(i));
			}
		}

		Integer value=visitLogica((LogicaContext) ctx.getChild(2));
		System.out.println(value);
		if(value == 0){
			int i=0;
			while (i!=100) {
				for (Object desarrollo : list) {
					visitDesarrollo((DesarrolloContext) desarrollo);
				}
				i++;
			}
		}
		return visitChildren(ctx); 
	}


}

/*
 * 
 * 
 * @Override
 * public Integer visitIf_st(ParserTParser.If_stContext ctx) {
 * // Guardamos la afirmación para poder hacerle los cambios de ser necesarios
 * // (aquí no lo fue, es un "True" o "False")
 * String afirmacion = ctx.getChild(2).getText();
 * 
 * // Se obtiene una lista de todos los statements en la frase.
 * List<Object> lista = new ArrayList<>();
 * for (int i = 0; i < ctx.getChildCount(); i++) {
 * // Cuidado que para comparar Strings en Java es recomendable usar el metodo
 * .equals()
 * if (tokenName(ctx.getChild(i)).equals("Statement")){
 * lista.add(ctx.getChild(i));
 * }
 * }
 * 
 * // Se confirma la validez de la afirmación.
 * // Es bastante probable que en su implementación aquí se deban hacer pasos
 * adicionales.
 * // En este caso es sencillo ya que la afirmación solo puede ser "True" o
 * "False"
 * if (afirmacion.equals("True")){
 * // Esta es solamente una forma abreviada de recorrer una lista
 * // Recorranla como mejor sepan hacerlo.
 * for (Object statement : lista){
 * // visitStatement recibe un objeto del tipo StatementContext.
 * // De ser necesario hagan un casteo.
 * visitStatement((StatementContext) statement);
 * }
 * }
 * // Fijese que como recorremos "a mano" los statements, no es necesario
 * invocar a visitChildren(ctx);
 * // (sin embargo tenemos que retornar un entero)
 * return 0;
 * }
 */
