package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class AssignExp extends Assign {
    public String var;
    public Expression exp;

    public AssignExp(Position pos, String var, Expression exp) {
        this.pos = pos;
        this.var = var;
        this.exp = exp;
    }
}
