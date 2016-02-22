package ast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class Function extends Ast {

    public Expression ret;
    public List<Instruction> ins;
    public HashMap<Type, String> paramValeur;
    public HashMap<Type, String> paramRef;

    public Function(Expression ret, List<Instruction> ins, HashMap<Type, String> paramValeur, HashMap<Type, String> paramRef) {
        this.ret = ret;
        this.ins = ins;
        this.paramValeur = paramValeur;
        this.paramRef = paramRef;
    }
}
