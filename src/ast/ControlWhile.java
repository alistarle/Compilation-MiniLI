package ast;

import exceptions.TypeIncoherent;

import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class ControlWhile extends Control{


    public Expression exp;
    public List<Instruction> ins;

    public ControlWhile(Position pos, Expression exp, List<Instruction> ins) {
        this.pos = pos;
        this.exp = exp;
        this.ins = ins;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("while("+ exp.toString() +"){\n");
        for (Instruction i : ins) {
            s.append(i.toString() + "\n");
        }
        return s.toString() + "}";
    }

    @Override
    public void verifSemantique() throws Exception {
        if(exp.getType()!= Type.EnumType.BOOLEAN){
            throw new TypeIncoherent(exp.getType().toString(),"Boolean");
        }
        table.newBlock();

        for(Instruction i:ins){
            i.verifSemantique();
        }

        table.popBlock();
    }
}
