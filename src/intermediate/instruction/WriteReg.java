package intermediate.instruction;

import ast.Expression;
import intermediate.Instruction;

/**
 * Created by alistarle on 22/04/2016.
 */
public class WriteReg extends Instruction{

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
        return "\treg" + reg + " := " + expression + "\n";
    }
}
