package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;

public class ExpIdArray extends Expression{

    public ExpVar id;
    public Expression exp;

    public ExpIdArray(Position pos, ExpVar id, Expression exp) {
        this.pos = pos;
        this.id = id;
        this.exp = exp;
    }

    public String toString() {
        return id.toString() + "[" + exp.toString() + "]";
    }

    @Override
    public Type.EnumType getType() throws Exception {
        if(exp.getType() != Type.EnumType.INT){
            throw new TypeIncoherent(exp.getType().toString(),"int");
        }else{
            return id.getType();
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType t = table.lookUp(id.name,false);
        if(t == null){
            throw new ReferenceIndefinie(id.name);
        }else if(exp.getType() != Type.EnumType.INT) {
            throw new TypeIncoherent(exp.getType().toString(),"int");
        }
        exp.verifSemantique();
    }
}