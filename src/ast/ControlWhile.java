package ast;

import miniLI.StringOffseter;

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
}
