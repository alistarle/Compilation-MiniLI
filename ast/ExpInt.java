package ast;

public class ExpInt extends Expression {
	public int value;
	public ExpInt(Position pos, int value){
		this.pos = pos;
		this.value = value;
	}
}
