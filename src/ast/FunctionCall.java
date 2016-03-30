package ast;

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
}
