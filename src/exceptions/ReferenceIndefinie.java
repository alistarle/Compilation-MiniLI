package exceptions;

/**
 * Created by max2 on 25/03/2016.
 */
public class ReferenceIndefinie extends Exception {
    public ReferenceIndefinie(String varname){
        System.err.println("Référence indéfinie : " + varname + " introuvable !");
    }
}
