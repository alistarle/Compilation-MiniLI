package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class RetExpression extends Ast{
    public Expression exp;

    public RetExpression(Position pos, Expression exp) {
        this.pos = pos;
        this.exp = exp;
    }

    public RetExpression(Position pos){
        this.pos = pos;
    }

    public boolean isNull(){
        return this.exp == null;
    }

    public String toString() {
        if(isNull()){
            return "RETURN";
        }else {
            return "RETURN " + exp.toString() + ";";
        }
    }
}
