package intermediate.instruction;

import intermediate.Expression;
import intermediate.Instruction;

/**
 * Created by alistarle on 22/04/2016.
 */
public class WriteMem extends Instruction{

    private Expression expressionLeft;
    private Expression expressionRight;

    public WriteMem(Expression expressionRight, Expression expressionLeft) {
        this.expressionRight = expressionRight;
        this.expressionLeft = expressionLeft;
    }

    public Expression getExpressionLeft() {
        return expressionLeft;
    }

    public Expression getExpressionRight() {
        return expressionRight;
    }

    @Override
    public String toString() {
        return "WriteMem{" +
                "expressionLeft=" + expressionLeft +
                ", expressionRight=" + expressionRight +
                '}';
    }
}
