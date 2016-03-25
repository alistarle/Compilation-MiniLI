package ast;

import table.Table;

public abstract class Ast {
	public Position pos;
	public Table table = new Table();

	abstract public void verifSemantique() throws Exception;
}


