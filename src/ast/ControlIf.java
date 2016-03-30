package ast;

import exceptions.TypeIncoherent;

import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class ControlIf extends Control {

    public Expression exp;
    public List<Instruction> lif;
    public List<Instruction> lelse;

    public ControlIf(Position pos,Expression exp, List<Instruction> lif, List<Instruction> lesle) {
        this.pos = pos;
        this.exp = exp;
        this.lif = lif;
        this.lelse = lesle;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("if("+exp.toString()+"){\n");
        for(Instruction i:lif){
            s.append(i.toString() + "\n");
        }
        s.append("}");
        if(lelse.size() != 0){
            s.append("else{\n");
        }
        for(Instruction i:lelse){
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

        for(Instruction i:lif){
            i.verifSemantique();
        }

        for(Instruction i:lelse){
            i.verifSemantique();
        }
        table.popBlock();
    }
}
