package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class ExpFunctionCall extends Expression {
    public FunctionCall fc;

    public ExpFunctionCall(Position pos, FunctionCall fc) {
        this.pos = pos;
        this.fc = fc;
    }
}
