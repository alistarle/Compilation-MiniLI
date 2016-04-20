package table;

import ast.Type;

/**
 * Created by max2 on 10/03/2016.
 */
public abstract class AbstractIdentificateur {
    String nom;
    Type.EnumType t;

    @Override
    public String toString() {
        return "Identificateur{" +
                "nom='" + nom + '\'' +
                ", t=" + t +
                '}';
    }
}
