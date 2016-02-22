package ast;

import java.util.*;

public class Program extends Ast {

	public List<IInstruction> program;

	public Program(Position pos, List<IInstruction> program){
		this.pos = pos;
		this.program = program;
	}
}
