package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import exceptions.VarExistante;
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

    public void insertIntoTable() throws Exception{
        //declaration
        if(!isNull()){
            Type.EnumType ty = Table.getInstance().lookUp(var,false);
            if(ty == null) {
                VarIdentificateur varId = new VarIdentificateur(t, var);
                Table.getInstance().addTopBlock(varId, isGlobal);
            }else{
                throw new VarExistante(var,pos);
            }
        }
    }

    @Override
    public void verifSemantique() throws Exception{
        insertIntoTable();
        Type.EnumType type = Table.getInstance().lookUp(var, false);
        if(type == null){
            throw new ReferenceIndefinie(var,pos);
        }else if(type != exp.getType()){
            throw new TypeIncoherent(type.toString(),exp.getType().toString(),pos);
        }
    }
}
