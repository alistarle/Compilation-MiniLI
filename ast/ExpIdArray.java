package ast;

public class ExpIdArray extends Expression{

    public ExpVar id;
    public ExpInt cs;

    public ExpIdArray(Position pos, ExpVar id, ExpInt cs) {
        this.pos = pos;
        this.id = id;
        this.cs = cs;
    }
}