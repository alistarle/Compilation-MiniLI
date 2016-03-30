package exceptions;

/**
 * Created by max2 on 30/03/2016.
 */
public class WrongIndex extends Exception {
    public WrongIndex(Integer i){
        System.err.println("Indice négatif ou égal à 0 : "+i.toString());
    }
}
