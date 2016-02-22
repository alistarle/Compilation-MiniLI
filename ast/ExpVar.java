package ast;

public class ExpVar extends Expression {
	public String name;
	public ExpVar(Position pos, String name){
		this.pos = pos;
		this.name = name;
	}
}
