package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class Retour extends Instruction {
    public Ret retour;

    public Retour(Position pos, Ret retour) {
        this.pos = pos;
        this.retour = retour;
    }
}
