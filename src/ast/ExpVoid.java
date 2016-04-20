package ast;

/**
 * Created by thomas on 22/02/16.
 */
public class ExpVoid extends Expression {

    @Override
    public Type.EnumType getType() throws Exception {
        return Type.EnumType.VOID;
    }

    @Override
    public void verifSemantique() throws Exception {

    }
}
