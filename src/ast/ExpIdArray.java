package ast;

public class ExpIdArray extends Expression{

    public String id;
    public Expression exp;

    public ExpIdArray(Position pos, String id, Expression exp) {
        this.pos = pos;
        this.id = id;
        this.exp = exp;
    }

    public String toString() {
        return id + "[" + exp.toString() + "]";
    }
}