package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class AssignExp extends Assign {
    public String var;
    public Expression exp;

    public AssignExp(String var, Expression exp) {
        this.var = var;
        this.exp = exp;
    }
}
