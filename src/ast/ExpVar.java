package ast;

public class ExpVar extends Expression {
	public String name;
	public boolean sub;
	public ExpVar(Position pos, String name, boolean sub){
		this.pos = pos;
		this.name = name;
		this.sub = sub;
	}

	public String toString() {
		return (sub) ? Binop.SUB.toString()+name.toString() : name.toString();
	}
}
