package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import table.Table;

/**
 * Created by thomas on 29/02/16.
 */
public class AssignTabExp extends Assign {

    public String nameTab;
    public Expression expParam;
    public Expression exp;

    public AssignTabExp(Position pos, String nameTab, Expression expParam, Expression exp) {
        this.pos = pos;
        this.nameTab = nameTab;
        this.expParam = expParam;
        this.exp = exp;
    }

    public String toString(){
        return nameTab + "[" + expParam.toString() + "] = " + exp.toString();
    }

    @Override
    public void verifSemantique() throws Exception{
        Type.EnumType t = Table.getInstance().lookUp(nameTab,false);
        if(t==null){
            throw new ReferenceIndefinie(nameTab,pos);
        }else{
            if(expParam.getType() != Type.EnumType.INTVAL){
                throw new TypeIncoherent(expParam.getType().toString(), "int",pos);
            }else {
                if(exp.getType() != t){
                    throw new TypeIncoherent(exp.getType().toString(),t.toString(),pos);
                }
            }
        }
    }
}
