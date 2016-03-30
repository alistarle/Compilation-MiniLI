package ast;

import exceptions.ReferenceIndefinie;

public class ExpVar extends Expression {
	public String name;
	public ExpVar(Position pos, String name){
		this.pos = pos;
		this.name = name;
	}
	public String toString() {
		return name.toString();
	}

	@Override
	public Type.EnumType getType() throws Exception {
		Type.EnumType t = table.lookUp(name,false);
		if(t!=null){
			return t;
		}else{
			throw new ReferenceIndefinie(name);
		}
	}

	@Override
	public void verifSemantique() throws Exception {
		getType();
	}
}
