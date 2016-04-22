package intermediate.instruction;

import intermediate.Expression;

import java.util.ArrayList;

/**
 * Created by alistarle on 22/04/2016.
 */
public class FunctionCall {

    private int lbl_index;
    private ArrayList<Expression> expressions;

    public FunctionCall(int lbl_index, ArrayList<Expression> expressions) {
        this.lbl_index = lbl_index;
        this.expressions = expressions;
    }

    public int getLbl_index() {
        return lbl_index;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        return "call " + lbl_index + " ("+ expressions + ")";
    }
}
