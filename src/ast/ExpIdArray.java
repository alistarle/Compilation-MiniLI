package ast;

public class ExpIdArray extends Expression{

    public ExpVar id;
    public Expression exp;

    public ExpIdArray(Position pos, ExpVar id, Expression exp) {
        this.pos = pos;
        this.id = id;
        this.exp = exp;
    }

    public String toString() {
        return id.toString() + "[" + exp.toString() + "]";
    }
}