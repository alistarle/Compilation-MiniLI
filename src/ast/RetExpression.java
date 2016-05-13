package ast;

import intermediate.Intermediate;
import intermediate.instruction.Goto;
import intermediate.instruction.WriteReg;

import java.util.ArrayList;

/**
 * Created by thomas on 24/02/16.
 */
public class RetExpression extends Instruction{
    public Expression exp;

    public RetExpression(Position pos, Expression exp) {
        this.pos = pos;
        this.exp = exp;
    }

    public RetExpression(Position pos){
        this.pos = pos;
    }

    public boolean isNull(){
        return this.exp == null;
    }

    public String toString() {
        if(isNull()){
            return "return";
        }else {
            return "return " + exp.toString();
        }
    }

    public Type.EnumType getType() throws Exception{
        return exp.getType();
    }

    @Override
    public void verifSemantique() throws Exception {
        exp.verifSemantique();
    }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        if(!isNull()) iList.add(new WriteReg(Intermediate.return_reg, exp));
        iList.add(new Goto(Intermediate.return_label));
        return iList;
    }
}
