package ast;

/**
 * Created by thomas on 29/02/16.
 */
public class DeclareVar extends Assign{

    public Type.EnumType t;
    public String var;

    public DeclareVar(Position pos, Type.EnumType t, String var) {
        this.pos = pos;
        this.t = t;
        this.var = var;
    }

    public String toString(){
        return t.toString() + " " + var;
    }
}
