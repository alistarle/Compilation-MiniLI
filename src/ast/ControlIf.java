package ast;

import miniLI.StringOffseter;
import exceptions.TypeIncoherent;
import table.Table;

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
        StringOffseter s = new StringOffseter("if("+exp.toString()+"){\n", false);
        StringOffseter.offset++;
        for(Instruction i:lif){
            String semicolon = (i instanceof Control)? "" : ";";
            s.append(i.toString() + semicolon + "\n");
        }
        StringOffseter.offset--;
        s.append("}");
        if(lelse.size() != 0){
            s.appendNoOffset("else{\n");
            StringOffseter.offset++;
            for(Instruction i:lelse){
                String semicolon = (i instanceof Control)? "" : ";";
                s.append(i.toString() + semicolon +"\n");
            }
            StringOffseter.offset--;
            s.append("}");
        }
        return s.toString();
    }

    @Override
    public void verifSemantique() throws Exception {
        if(exp.getType()!= Type.EnumType.BOOLVAL){
            throw new TypeIncoherent(exp.getType().toString(),"Boolean",pos);
        }

        Table.getInstance().newBlock();

        for(Instruction i:lif){
            i.verifSemantique();
        }

        for(Instruction i:lelse){
            i.verifSemantique();
        }
        Table.getInstance().popBlock();
    }
}
