package ast;

import miniLI.StringOffseter;
import exceptions.TypeIncoherent;
import table.Table;

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
        StringOffseter s = new StringOffseter("while("+ exp.toString() +"){\n",false);
        StringOffseter.offset++;
        for (Instruction i : ins) {
            String semicolon = (i instanceof Control)? "" : ";";
            s.append(i.toString() + semicolon + "\n");
        }
        StringOffseter.offset--;
        s.append("}");
        return s.toString();
    }

    @Override
    public void verifSemantique() throws Exception {
        if(exp.getType()!= Type.EnumType.BOOLVAL){
            throw new TypeIncoherent(exp.getType().toString(),"Boolean",pos);
        }
        Table.getInstance().newBlock();

        for(Instruction i:ins){
            i.verifSemantique();
        }

        Table.getInstance().popBlock();
    }
}
