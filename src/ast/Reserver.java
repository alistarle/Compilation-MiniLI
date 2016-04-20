package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Reserver extends Assign {

    public String var;

    public Reserver(Position pos, String var) {
        this.pos = pos;
        this.var = var;
    }

    public String toString() {
        return "";
    }

    @Override
    public void verifSemantique() throws Exception {

    }
}
