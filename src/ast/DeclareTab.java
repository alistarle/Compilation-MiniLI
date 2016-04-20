package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import exceptions.WrongIndex;
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

    public void insertIntoTable() throws Exception{
        Type.EnumType t = Table.getInstance().lookUp(id,false);
        if(t != null) {
            VarIdentificateur varIdentificateur = new VarIdentificateur(t, id);
            Table.getInstance().addTopBlock(varIdentificateur, isGlobal);
        }else{
            throw new ReferenceIndefinie(id);
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        insertIntoTable();
        if(cstIsNull()){
            Type.EnumType t = Table.getInstance().lookUp(idParam,false);
            if(t != Type.EnumType.INT){
                throw new TypeIncoherent(t.toString(), "int");
            }
        }else if(cst <= 0){
            throw new WrongIndex(cst);
        }
    }
}
