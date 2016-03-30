package ast;

import exceptions.TypeIncoherent;
import exceptions.VarExistante;
import table.FunctionIdentificateur;
import table.Table;

import java.util.HashMap;
import java.util.List;

/**
 * Created by thomas on 22/02/16.
 */
public class Function extends Ast {

    public RetExpression ret;
    public List<Instruction> ins;
    public HashMap<Type.EnumType, String> paramVal;
    public HashMap<Type.EnumType, String> paramRef;
    public String id;
    public Type.EnumType type;

    public Function(Position pos,RetExpression ret, List<Instruction> ins, HashMap<Type.EnumType, String> paramVal, HashMap<Type.EnumType, String> paramRef, String id, Type.EnumType type) {
        this.pos = pos;
        this.ret = ret;
        this.ins = ins;
        this.paramVal = paramVal;
        this.paramRef = paramRef;
        this.id = id;
        this.type = type;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(type.toString() + " " + id.toString() +"(");
        for(HashMap.Entry<Type.EnumType, String> entry : paramVal.entrySet()){
            s.append(entry.getKey().toString() + " " + entry.getValue().toString() + ",");
        }
        for(HashMap.Entry<Type.EnumType, String> entry : paramRef.entrySet()){
            s.append("&" + entry.getKey().toString() + " " + entry.getValue().toString() + ",");
        }
        //remove the last ","
        s.deleteCharAt(s.length()-1);
        s.append("){\n");

        for(Instruction i: ins){
            s.append(i.toString() + "\n");
        }

        return s.toString() + ret.toString();
    }

    public void insertIntoTable(Table table) throws Exception{
        Type.EnumType t = table.lookUp(id,true);
        if(t != null) {
            FunctionIdentificateur fId = new FunctionIdentificateur(type, id);

            for (HashMap.Entry<Type.EnumType, String> entry : paramVal.entrySet()) {
                fId.addVal(entry.getKey(), entry.getValue());
            }
            for (HashMap.Entry<Type.EnumType, String> entry : paramRef.entrySet()) {
                fId.addRef(entry.getKey(), entry.getValue());
            }

            table.addTopBlock(fId, true);
        }else {
            throw new VarExistante(id);
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType t = table.lookUp(id,true);
        if(type != ret.getType()) {
            throw new TypeIncoherent(type.toString(), ret.getType().toString());
        }

        for(Instruction i:ins){
            i.verifSemantique();
        }

        table.popBlock();
    }
}
