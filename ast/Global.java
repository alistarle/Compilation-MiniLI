package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Global extends IInstruction {
    public Affectation affectation;

    public Global(Affectation affectation) {
        this.affectation = affectation;
    }
}
