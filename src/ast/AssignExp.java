package ast;

import table.Table;
import table.VarIdentificateur;

/**
 * Created by thomas on 22/02/16.
 */
public class AssignExp extends Assign {
    public Type.EnumType t;
    public String var;
    public Expression exp;

    public AssignExp(Position pos, Type.EnumType t, String var, Expression exp) {
        this.t = t;
        this.pos = pos;
        this.var = var;
        this.exp = exp;
    }

    public boolean isNull(){
        return this.t == null;
    }

    public String toString() {
        if (isNull()){
            return var + " = " + exp.toString();
        }
        else {
            return t.toString() + " " + var + " = " + exp.toString();
        }
    }

    public void insertIntoTable(){
        //declaration
        if(!isNull()){
            VarIdentificateur varId = new VarIdentificateur(t, var);
            table.addTopBlock(varId,isGlobal);
        }
    }

    @Override
    public void verifSemantique() {

    }
}
