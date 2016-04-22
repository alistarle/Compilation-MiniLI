package intermediate.instruction;

import intermediate.Expression;

/**
 * Created by alistarle on 22/04/2016.
 */
public class WriteReg {

    private int reg;
    private Expression expression;

    public WriteReg(int reg, Expression expression) {
        this.reg = reg;
        this.expression = expression;
    }

    public int getReg() {
        return reg;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "\treg" + reg + " := " + expression;
    }
}
