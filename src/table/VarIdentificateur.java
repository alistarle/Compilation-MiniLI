package table;
import ast.Type;

/**
 * Created by max2 on 10/03/2016.
 */
public class VarIdentificateur extends AbstractIdentificateur{
    private Type t;

    VarIdentificateur(Type t, String n, int a){
        this.t = t;
        this.addresse = a;
        this.nom = n;
    }
}
