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
        this.param;
    }
}
