package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class RetFunctionCall extends Ret {
    public FunctionCall fc;

    public RetFunctionCall(Position pos, FunctionCall fc) {
        this.pos = pos;
        this.fc = fc;
    }
}
