package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Affectation extends Ast {
    public Assign assign;

    public Affectation(Assign assign) {
        this.assign = assign;
    }
}
