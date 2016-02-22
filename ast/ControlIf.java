package ast;

import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class ControlIf extends Control {

    public Expression exp;
    public List<Instruction> lif;
    public List<Instruction> lesle;

    public ControlIf(Expression exp, List<Instruction> lif, List<Instruction> lesle) {
        this.exp = exp;
        this.lif = lif;
        this.lesle = lesle;
    }
}
