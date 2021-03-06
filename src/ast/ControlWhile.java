package ast;

import intermediate.Intermediate;
import intermediate.instruction.Goto;
import intermediate.instruction.Jump;
import intermediate.instruction.Label;
import miniLI.StringOffseter;
import exceptions.TypeIncoherent;
import table.Table;

import java.util.ArrayList;
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

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        Label test = new Label(Intermediate.fresh_lbl());
        Label loop = new Label(Intermediate.fresh_lbl());
        Label end = new Label(Intermediate.fresh_lbl());

        iList.add(test);
        iList.add(new Jump(exp, loop, end));

        iList.add(loop);
        for(Instruction instruction : ins)
        {
            iList.addAll(instruction.genIntermediate());
        }
        iList.add(new Goto(test));

        iList.add(end);
        return iList;
    }
}
