package ast;

public class ExpUnop extends Expression {
    public Expression right;
    public Binop op;

    public ExpUnop(Position pos, Expression right, Binop op) {
        this.pos = pos;
        this.right = right;
        this.op = op;
    }
    public String toString() {
        return op.toString() + right.toString();
    }
}
