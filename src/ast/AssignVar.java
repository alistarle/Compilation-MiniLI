package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class AssignVar extends Assign {
    public String v1;
    public String v2;

    public AssignVar(Position pos,String v1, String v2) {
        this.pos = pos;
        this.v1 = v1;
        this.v2 = v2;
    }

    public String toString() {
        return v1 + " = " + v2;
    }
}
