package miniLI;

import ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by thomas on 24/02/16.
 */
public class BuildAST extends MiniliBaseVisitor<Ast> {

    public static Position position(ParserRuleContext ctx){
        Position pos = new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        return pos;
    }


    @Override
    public Ast visitControleWhile(MiniliParser.ControleWhileContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        List<Instruction> ins =  new ArrayList<>();

        for(ParseTree child : ctx.instruction()){
            Ast i = visit(child);
            if(i != null && i instanceof Instruction){
                ins.add((Instruction) i);
            }
        }
        return new ControlWhile(position(ctx), e, ins);
    }

    @Override
    public Ast visitControleIf(MiniliParser.ControleIfContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        List<Instruction> lif = new ArrayList<>();
        List<Instruction> lelse = new ArrayList<>();

        for(ParseTree child : ctx.instructionList(0).instruction()){
            Ast i = visit(child);
            if(i != null && i instanceof Instruction){
                lif.add((Instruction) i);
            }
        }
        for(ParseTree child : ctx.instructionList(1).instruction()){
            Ast i = visit(child);
            if(i != null && i instanceof Instruction){
                lelse.add((Instruction) i);
            }
        }
        return new ControlIf(position(ctx), e, lif, lelse );
    }

    @Override
    public Ast visitReturnOnly(MiniliParser.ReturnOnlyContext ctx){
        return new RetExpression(position(ctx), null);
    }

    @Override
    public Ast visitReturnExp(MiniliParser.ReturnExpContext ctx) {
        return new RetExpression(position(ctx), (Expression)visit(ctx.expression()));
    }

    @Override
    public Ast visitInstruction(MiniliParser.InstructionContext ctx) {
        return null;
    }

    @Override
    public Ast visitDeclareVar(MiniliParser.DeclareVarContext ctx) {
        return new DeclareVar(position(ctx), Type.EnumType.valueOf(ctx.type().toString()), ctx.Identifiant().toString());
    }

    @Override
    public Ast visitAssignExp(MiniliParser.AssignExpContext ctx) {
        return new AssignExp(position(ctx), Type.EnumType.valueOf(ctx.type().toString()), ctx.Identifiant().toString(), (Expression) visit(ctx.expression()));
    }

    @Override
    public Ast visitAssignTabExp(MiniliParser.AssignTabExpContext ctx) {
        return new AssignTabExp(position(ctx), ctx.Identifiant().toString() ,(Expression)visit(ctx.expression(0)), (Expression) visit(ctx.expression(1)));
    }

    @Override
    public Ast visitDeclareTab(MiniliParser.DeclareTabContext ctx) {

        return new DeclareTab(position(ctx), Type.EnumType.valueOf(ctx.type().toString()),  Integer.parseInt(ctx.Constante().toString()) , ctx.Identifiant(1).toString(), ctx.Identifiant(0).toString());
    }

    @Override public Ast visitMulDiv(MiniliParser.MulDivContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        if ( ctx.op.getType() == MiniliLexer.MUL)
            return new ExpBinop(position(ctx),e0,Binop.MUL,e1);
        else
            return new ExpBinop(position(ctx),e0,Binop.DIV,e1);
    }

    @Override public Ast visitPar(MiniliParser.ParContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        return e;
    }

    @Override public Ast visitAddSub(MiniliParser.AddSubContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        if ( ctx.op.getType() == MiniliLexer.ADD)
            return new ExpBinop(position(ctx),e0,Binop.ADD,e1);
        else
            return new ExpBinop(position(ctx),e0,Binop.SUB,e1);
    }

    @Override public Ast visitLogic(MiniliParser.LogicContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case MiniliLexer.AND:
                return new ExpBinop(position(ctx),e0,Binop.AND,e1);
            case MiniliLexer.OR:
                return new ExpBinop(position(ctx),e0,Binop.OR,e1);
        }
        return null;
    }

    @Override public Ast visitLogicNot(MiniliParser.LogicNotContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        return new ExpUnop(position(ctx), e, Binop.NOT);
    }

    @Override public Ast visitComp(MiniliParser.CompContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case MiniliLexer.GT:
                return new ExpBinop(position(ctx),e0,Binop.GT,e1);
            case MiniliLexer.GTE:
                return new ExpBinop(position(ctx),e0,Binop.GTE,e1);
            case MiniliLexer.LT:
                return new ExpBinop(position(ctx),e0,Binop.LT,e1);
            case MiniliLexer.LTE:
                return new ExpBinop(position(ctx),e0,Binop.LTE,e1);
        }
        return null;
    }

    @Override public Ast visitEqual(MiniliParser.EqualContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()) {
            case MiniliLexer.EQ:
                return new ExpBinop(position(ctx), e0, Binop.EQ, e1);
            case MiniliLexer.NEQ:
                return new ExpBinop(position(ctx), e0, Binop.NEQ, e1);
        }
        return null;
    }

    @Override public Ast visitChar(MiniliParser.CharContext ctx) {
        return new ExpChar(position(ctx), ctx.CHAR().toString());
    }

    @Override public Ast visitBoolean(MiniliParser.BooleanContext ctx) {
        return new ExpBool(position(ctx), Bool.valueOf(ctx.BOOLEAN().toString()));
    }
    @Override public Ast visitInt(MiniliParser.IntContext ctx) {
        return new ExpInt(position(ctx), Integer.parseInt(ctx.Constante().toString()));
    }

    @Override public Ast visitType(MiniliParser.TypeContext ctx) {
        if(ctx.Int() != null)
            return new Type(position(ctx), Type.EnumType.INT);
        else if(ctx.Boolean() != null)
            return new Type(position(ctx), Type.EnumType.BOOLEAN);
        else if(ctx.Char() != null){
            return new Type(position(ctx), Type.EnumType.CHAR);
        }
        else if(ctx.Void() != null){
            return new Type(position(ctx), Type.EnumType.VOID);
        }
        return null;
    }

    @Override public Ast visitId(MiniliParser.IdContext ctx) {
        return new ExpVar(position(ctx), ctx.Identifiant().toString());
    }

    @Override public Ast visitIdArray(MiniliParser.IdArrayContext ctx) {
        return new ExpIdArray(position(ctx), (ExpVar) ctx.Identifiant(), (Expression) visit(ctx.expression()));
    }

    @Override public Ast visitProgram(MiniliParser.ProgramContext ctx) {
        List<Global> g = new ArrayList<>();
        List<Function> f = new ArrayList<>();

        for(ParseTree child : ctx.children){
            Ast i = visit(child);
            if(i == null) {
                System.out.println("inull");
            }
            if(i != null && i instanceof Global){
                g.add((Global)i);
            }else if(i != null && i instanceof Function){
                f.add((Function)i);
            }
        }
        return new Program(position(ctx),g,f);
    }

    @Override public Ast visitGlobal(MiniliParser.GlobalContext ctx) {
        return new Global(position(ctx), (Affectation) visit(ctx.affectation()));
    }


    @Override public Ast visitFunction(MiniliParser.FunctionContext ctx) {
            RetExpression r = (RetExpression) visit(ctx.ret());
            List<Instruction> ins =  new ArrayList<>();
            HashMap<Type.EnumType, String> param = new HashMap<>();

            for(ParseTree child : ctx.instruction()){
                Ast i = visit(child);
                if(i != null && i instanceof Instruction){
                    ins.add((Instruction) i);
                }
            }
            for(int i = 0; i<ctx.type().size() ; i++) {
                param.put(Type.EnumType.valueOf(ctx.type(i).toString()),ctx.Identifiant(i).toString());
            }
            //si ctx.Identifiant(0) = l'id de la fonction, alors les deux boucles au dessus commence 1 cran trop t�t, idem pour type
            return new Function(position(ctx),r,ins,param,ctx.Identifiant(0).toString(),(Type)visit(ctx.type(0)));
        }

    @Override public Ast visitFunctionCall(MiniliParser.FunctionCallContext ctx) {
            List<Expression> param = new ArrayList<>();
            for(ParseTree child : ctx.expression()){
                Ast i = visit(child);
                if(i != null && i instanceof Expression){
                    param.add((Expression) i);
                }
            }
            return new FunctionCall(position(ctx),ctx.Identifiant(0).toString(),param);
        }


    @Override public Ast visitExpFunctionCall(MiniliParser.ExpFunctionCallContext ctx) {
        List<Expression> param = new ArrayList<>();
        for(ParseTree child : ctx.functionCall().expression()){
            Ast i = visit(child);
            if(i != null && i instanceof Expression){
                param.add((Expression) i);
            }
        }
        return new FunctionCall(position(ctx),ctx.functionCall().Identifiant(0).toString(),param);
    }
}
