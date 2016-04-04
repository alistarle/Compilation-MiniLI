package ast;

/**
 * Created by thomas on 24/02/16.
 */
public class RetExpression extends Instruction{
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
            return "return";
        }else {
            return "return " + exp.toString();
        }
    }
}
