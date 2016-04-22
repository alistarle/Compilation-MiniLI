package intermediate;

/**
 * Created by alistarle on 22/04/2016.
 */
public class Expression {

    private String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return expression;
    }
}
