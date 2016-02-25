package miniLI;

import ast.*;
import parser.*;

/**
 * Created by thomas on 24/02/16.
 */
public class BuildAST extends MiniliBaseVisitor<Ast> {

    public static Position position(ParserRuleContext ctx){
        Position pos = new Position(ctx.start.getLine(),
                ctx.start.getCharPositionInLine());
        return pos;
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

    @Override public T visitLogic(MiniliParser.LogicContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case MiniliLexer.AND:
                return new ExpBinop(position(ctx),e0,Binop.AND,e1);
            case MiniliLexer.OR:
                return new ExpBinop(position(ctx),e0,Binop.OR,e1);
        }
    }

    @Override public T visitLogicNot(MiniliParser.LogicNotContext ctx) {
        Expression e = (Expression) visit(ctx.expression);
        return new ExpUnop(position(ctx), e, Binop.NOT);
    }

    @Override public T visitComp(MiniliParser.CompContext ctx) {
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
    }

    @Override public T visitEqual(MiniliParser.EqualContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case MiniliLexer.EQ:
                return new ExpBinop(position(ctx),e0,Binop.EQ,e1);
            case MiniliLexer.NEQ:
                return new ExpBinop(position(ctx),e0,Binop.NEQ,e1);
    }

    @Override public T visitChar(MiniliParser.CharContext ctx) {
        return new ExpChar(position(ctx), ctx.CHAR());
    }

    @Override public T visitBoolean(MiniliParser.BooleanContext ctx) {
        return new ExpBool(position(ctx), ctx.BOOLEAN());
    }
    @Override public T visitInt(MiniliParser.IntContext ctx) {
        return new ExpInt(position(ctx), Integer.parseInt(ctx.Constante().toString()));
    }

    @Override public T visitType(MiniliParser.TypeContext ctx) {
        switch ctx
    }

    @Override public T visitId(MiniliParser.IdContext ctx) {
        return new ExpVar(position(ctx), ctx.Identifiant().toString());
    }

    @Override public T visitIdArray(MiniliParser.IdArrayContext ctx) {
        return new ExpIdArray(position(ctx), ctx.Identifiant().toString(), ctx.Constante().toString());
    }

    @Override public T visitProgram(MiniliParser.ProgramContext ctx) {
        List<Global> g;
        List<function> f;

        for(ParseTree child : ctx.children){
            Ast i = visit(child);
            if(i != null && i instanceof Global){
                g.add((Global)i);
            }else if(i != null && i instanceof Function){
                f.add((Function)i);
            }
        }
        return new Program(position(ctx),g,f);
    }

    @Override public T visitGlobal(MiniliParser.GlobalContext ctx) {
        return ;
    }

    @Override public T visitAffectation(MiniliParser.AffectationContext ctx) { return visitChildren(ctx); }

    @Override public T visitFunction(MiniliParser.FunctionContext ctx) {
            Expression exp = (Expression) visit(ctx.ret().expression());
            List<Instruction> ins = ctx.instruction();
            HashMap<Type, String> param;

            for(int i = 0; i<ctx.type().size ; i++) {
                param.put(ctx.type(i),ctx.Identifiant(i).toString());
            }

            return new Function(position(ctx),exp,ins,param);
        }

    @Override public T visitFunctionCall(MiniliParser.FunctionCallContext ctx) {
            List<Expression> param = ctx.expression();
            // /!\
            return new FunctionCall(position(ctx),ctx.Identifiant(0).toString(),param);
        }

    @Override public T visitAssign(MiniliParser.AssignContext ctx) {
            //on suppose récuperer un objet affectation
            Ast i = ctx.children;
            if(i != null && i instanceof AssignVar){
                // /!\
                return new AssignVar(Position(ctx),i.Identifiant(),((IdContext)i.expression().Identifiant());
            }
        }

    @Override public T visitFunctionCalll(MiniliParser.FunctionCalllContext ctx) {
            return ctx.functionCall();
        }

    @Override public T visitControl(MiniliParser.ControlContext ctx){
            Expression exp = (Expression) ctx.controle().expression();
        }
            for(ParseTree child : ctx.controle().children) {
                Ast i = visit(child);
                if(i != null && i == MiniliLexer.IF){
                    return new ControlIf(Position(ctx),exp,);
                }
            }
        }

    @Override public T visitRetour(MiniliParser.RetourContext ctx) { return visitChildren(ctx); }

    @Override public T visitRet(MiniliParser.RetContext ctx) {

        }

    @Override public T visitControle(MiniliParser.ControleContext ctx) {
            Expression exp = (Expression) ctx.expression();

        }

    @Override public T visitExpFunctionCall(MiniliParser.ExpFunctionCallContext ctx) {
            return new RetFunctionCall(Position(ctx), ctx.functionCall());
        }












}
