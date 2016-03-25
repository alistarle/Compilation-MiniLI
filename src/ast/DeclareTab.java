package ast;

import table.Table;
import table.VarIdentificateur;

/**
 * Created by thomas on 29/02/16.
 */
public class DeclareTab extends Assign {

    public Type.EnumType t;
    public String id;
    public Integer cst;
    public String idParam;

    public DeclareTab(Position pos, Type.EnumType t, Integer cst, String idParam, String id) {
        this.pos = pos;
        this.t = t;
        this.cst = cst;
        this.idParam = idParam;
        this.id = id;
    }

    public boolean cstIsNull(){
        return cst == null;
    }

    public boolean idParamIsNull(){
        return idParam == null;
    }

    public String toString(){
        if(cstIsNull()){
            return t.toString() + " " + id + "[" + idParam.toString() + "]";
        }
        else{
            return t.toString() + " " + id + "[" + cst.toString() + "]";
        }
    }

    public void insertIntoTable(){
        VarIdentificateur varIdentificateur = new VarIdentificateur(t, id);
        table.addTopBlock(varIdentificateur,isGlobal);
    }
}
