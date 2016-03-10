package table;
import ast.Type;

import java.util.HashMap;

/**
 * Created by max2 on 10/03/2016.
 */
public class FunctionIdentificateur extends AbstractIdentificateur{
    private Type retour;
    private HashMap<Type,String> paramVal;
    private HashMap<Type,String> paramRef;

    FunctionIdentificateur(Type r, String n, int a){
        paramRef = new HashMap<Type,String>();
        paramVal = new HashMap<Type,String>();
        this.retour = r;
        this.addresse = a;
        this.nom = n;
    }

    void addRef(Type t, String n){
        paramRef.put(t,n);
    }

    void addVal(Type t, String n){
        paramVal.put(t,n);
    }
}
