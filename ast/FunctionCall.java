package ast;

import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class FunctionCall extends Instruction {

    public String id;
    public List<String> paramValeur;
    public List<String> paramRef;

    public FunctionCall(String id, List<String> paramValeur, List<String> paramRef) {
        this.id = id;
        this.paramValeur = paramValeur;
        this.paramRef = paramRef;
    }
}
