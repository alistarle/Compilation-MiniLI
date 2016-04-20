package exceptions;

/**
 * Created by max2 on 30/03/2016.
 */
public class VarExistante extends Exception {
    public VarExistante(String v){
        System.err.println(v + " existe déjà !");
    }
}
