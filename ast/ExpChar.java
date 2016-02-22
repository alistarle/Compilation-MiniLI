package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class ExpChar extends Expression {
    public char value;
    public ExpChar(Position pos, char value){
        this.pos = pos;
        this.value = value;
    }
}
