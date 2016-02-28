package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Global extends Ast {
    public Affectation affectation;

    public Global(Position pos, Affectation affectation) {
        this.pos = pos;
        this.affectation = affectation;
    }

    public String toString() {
        return affectation.toString() + ";";
    }
}
