package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import table.Table;
import table.VarIdentificateur;

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
        if(!table.lookUp(nameTab,false)){
            throw new ReferenceIndefinie(nameTab);
        }else{
            if(!(expParam.getType() == Type.EnumType.INT)){
                throw new TypeIncoherent(expParam.getType().toString(), "int");
            }else {
                if(!(exp.getType() == table.lookUp(nameTab, false))){

                }
            }
        }
    }
}
