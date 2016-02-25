// Generated from /media/thomas/5E197C420C4B9AFF/Compilation/Projet/src/Minili.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniliParser}.
 */
public interface MiniliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link MiniliParser#minili}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniliParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link MiniliParser#minili}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniliParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#iinstruction}.
	 * @param ctx the parse tree
	 */
	void enterIinstruction(MiniliParser.IinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#iinstruction}.
	 * @param ctx the parse tree
	 */
	void exitIinstruction(MiniliParser.IinstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniliParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniliParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(MiniliParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(MiniliParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(MiniliParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(MiniliParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MiniliParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MiniliParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MiniliParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MiniliParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiniliParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiniliParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCalll}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCalll(MiniliParser.FunctionCalllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCalll}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCalll(MiniliParser.FunctionCalllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Control}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterControl(MiniliParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Control}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitControl(MiniliParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retour}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRetour(MiniliParser.RetourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retour}
	 * labeled alternative in {@link MiniliParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRetour(MiniliParser.RetourContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(MiniliParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(MiniliParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniliParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(MiniliParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniliParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(MiniliParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(MiniliParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(MiniliParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MiniliParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MiniliParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MiniliParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MiniliParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpFunctionCall}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFunctionCall(MiniliParser.ExpFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpFunctionCall}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFunctionCall(MiniliParser.ExpFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdArray}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdArray(MiniliParser.IdArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdArray}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdArray(MiniliParser.IdArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(MiniliParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(MiniliParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComp(MiniliParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComp(MiniliParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicNot(MiniliParser.LogicNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicNot(MiniliParser.LogicNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MiniliParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MiniliParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChar(MiniliParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChar(MiniliParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(MiniliParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(MiniliParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MiniliParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MiniliParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic(MiniliParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link MiniliParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic(MiniliParser.LogicContext ctx);
}