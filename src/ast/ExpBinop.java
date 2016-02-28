package ast;

public class ExpBinop extends Expression {
	public Expression left;
	public Expression right;
	public Binop op;
	public ExpBinop(Position pos, Expression left, Binop op, Expression right){
		this.pos = pos;
		this.left = left;
		this.op = op;
		this.right = right;
	}
	public String toString() {
		return left.toString() + op.toString() + right.toString();
	}
}
