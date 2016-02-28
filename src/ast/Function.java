package ast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class Function extends Ast {

    public RetExpression ret;
    public List<Instruction> ins;
    public HashMap<Type.EnumType, String> param;
    public String id;
    public Type type;

    public Function(Position pos,RetExpression ret, List<Instruction> ins, HashMap<Type.EnumType, String> param, String id, Type type) {
        this.pos = pos;
        this.ret = ret;
        this.ins = ins;
        this.param = param;
        this.id = id;
        this.type = type;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(type.toString() + " " + id.toString() +"(");
        for(HashMap.Entry<Type.EnumType, String> entry : param.entrySet()){
            s.append(entry.getKey().toString() + " " + entry.getValue().toString() + ",");
        }
        //remove the last ","
        s.deleteCharAt(s.length()-1);
        s.append("){\n");

        for(Instruction i: ins){
            s.append(i.toString() + "\n");
        }

        return s.toString() + ret.toString();
    }
}
