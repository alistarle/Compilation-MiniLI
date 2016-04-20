package ast;

import exceptions.ReferenceIndefinie;
import table.FunctionIdentificateur;
import table.Table;

import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class FunctionCall extends Instruction {

    public String id;
    public List<Expression> param;

    public FunctionCall(Position pos,String id, List<Expression> param) {
        this.pos = pos;
        this.id = id;
        this.param = param;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(id +"(");

        for(Expression i: param){
            s.append(i.toString() + ",");
        }

        //remove last ","
        s.deleteCharAt(s.length()-1);
        s.append(")");

        return s.toString();
    }

    @Override
    public void verifSemantique() throws Exception {
        if( !(id.equals("in") || id.equals("out"))){

            FunctionIdentificateur f = Table.getInstance().getFunc(id);
            //probleme parametres
            if (f == null) {
                throw new ReferenceIndefinie(id,pos);
            }
        }
    }
}
