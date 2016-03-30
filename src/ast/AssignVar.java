package ast;

import exceptions.TypeIncoherent;

/**
 * Created by thomas on 22/02/16.
 */
public class AssignVar extends Assign {
    public String v1;
    public String v2;

    public AssignVar(Position pos,String v1, String v2) {
        this.pos = pos;
        this.v1 = v1;
        this.v2 = v2;
    }

    public String toString() {
        return v1 + " = " + v2;
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType t1 = table.lookUp(v1,false);
        Type.EnumType t2 = table.lookUp(v2,false);
        if(t1!=t2){
            throw new TypeIncoherent(t1.toString(),t2.toString());
        }
    }
}
