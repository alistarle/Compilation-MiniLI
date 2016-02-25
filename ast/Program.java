package ast;

import java.util.*;

public class Program extends Ast {

	public List<Global> global;
	public List<Function> function:

	public Program(Position pos, List<Global> global, List<Function> function){
		this.function = function;
		this.pos = pos;
		this.global = global;
	}
}
