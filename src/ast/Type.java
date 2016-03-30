package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Type extends Ast{
    public enum EnumType {INT, CHAR, BOOLEAN, VOID}
    private EnumType t;

    public Type(Position pos, EnumType t){
        this.pos = pos;
        this.t = t;
    }

    public EnumType getType() {
        return t;
    }

    public String toString() {
        return t.toString();
    }
}

