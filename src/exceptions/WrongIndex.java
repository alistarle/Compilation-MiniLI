package exceptions;

/**
 * Created by max2 on 30/03/2016.
 */
public class WrongIndex extends Exception {
    public WrongIndex(Integer i){
        System.err.println("Indice n�gatif ou �gal � 0 : "+i.toString());
    }
}
