package ast;


import miniLI.StringOffseter;

/**
 * Created by thomas on 22/02/16.
 */
public class Global extends Ast {
    public Affectation affectation;

    public Global(Position pos, Affectation affectation) {
        this.pos = pos;
        this.affectation = affectation;
        this.affectation.assign.isGlobal = true;
    }

    public String toString() {
        return new StringOffseter(affectation.toString() + ";").toString();
    }

}
