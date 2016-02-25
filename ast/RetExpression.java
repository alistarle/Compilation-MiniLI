package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class RetExpression extends Ret{
    public Expression exp;

    public RetExpression(Position pos, Expression exp) {
        this.pos = pos;
        this.exp = exp;
    }
}
