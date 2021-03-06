package ast;

import intermediate.Instruction;
import intermediate.Intermediate;
import intermediate.instruction.FunctionCall;
import intermediate.instruction.Label;
import table.FunctionIdentificateur;

import java.util.ArrayList;

/**
 * Created by thomas on 22/02/16.
 */
public class Reserver extends Assign {

    public enum Function {
        IN(new FunctionIdentificateur(Type.EnumType.INTVAL, "in")),
        OUT(new FunctionIdentificateur(Type.EnumType.VOIDVAL, "out"));

        private FunctionIdentificateur fi;

        Function(FunctionIdentificateur fi){
            fi.setIndex(Intermediate.fresh_lbl());
            this.fi = fi;
        }

        public FunctionIdentificateur getFi() { return fi; }

        public Label getLabel(){
            return new Label(fi.getIndex());
        }
    }

    public Function var;

    public Reserver(Position pos, String var) {
        this.pos = pos;
        this.var = Function.valueOf(var);
    }

    public String toString() {
        return var.name();
    }

    @Override
    public void verifSemantique() throws Exception {

    }

    @Override
    public ArrayList<Instruction> genIntermediate() {
        ArrayList<Instruction> iList = new ArrayList<>();
        //TODO Gen expression for argument of reserved function ( in, out... )
        iList.add(new FunctionCall(Function.IN.getLabel(), new ArrayList<>()));
        return iList;
    }
}
