package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class Type extends Ast{
    @Override
    public void verifSemantique() throws Exception {

    }

    public enum EnumType {INT, CHAR, BOOLEAN, VOID}
    public static EnumType t;

    public Type(Position pos, EnumType t){
        this.pos = pos;
        this.t = t;
    }
    public String toString() {
        return t.toString();
    }
}

