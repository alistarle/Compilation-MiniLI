package ast;

import exceptions.ReferenceIndefinie;
import table.Table;

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

	@Override
	public Type.EnumType getType() throws Exception {
		Type.EnumType t = Table.getInstance().lookUp(name,false);
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
