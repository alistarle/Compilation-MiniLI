package ast;

import exceptions.VarExistante;
import intermediate.Intermediate;
import table.Table;
import table.VarIdentificateur;
/**
 * Created by thomas on 29/02/16.
 */
public class DeclareVar extends Assign{

    public Type.EnumType t;
    public int reg_index;
    public String var;

    public DeclareVar(Position pos, Type.EnumType t, String var) {
        this.pos = pos;
        this.t = t;
        this.var = var;
    }

    public Type.EnumType getT() {
        return t;
    }

    public String getVar() {
        return var;
    }

    public String toString(){
        return t.toString() + " " + var;
    }

    public void insertIntoTable() throws Exception{
        Type.EnumType ty = Table.getInstance().lookUp(var,false);
        if(ty == null) {
            VarIdentificateur varId = new VarIdentificateur(t, var);
            this.reg_index = Intermediate.fresh_reg();
            Table.getInstance().addTopBlock(varId, isGlobal);
        }else{
            throw new VarExistante(var,pos);
        }
    }

    public int getIndex() {
        return reg_index;
    }

    public void setIndex(int index) {
        this.reg_index = index;
    }

    @Override
    public void verifSemantique() throws Exception {
        insertIntoTable();
    }
}
