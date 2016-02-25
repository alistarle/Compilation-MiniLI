package ast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class Function extends Ast {

    public Expression ret;
    public List<Instruction> ins;
    public HashMap<Type, String> param;

    public Function(Position pos,Expression ret, List<Instruction> ins, HashMap<Type, String> param) {
        this.pos = pos;
        this.ret = ret;
        this.ins = ins;
        this.param = param;
    }
}
