package exceptions;

/**
 * Created by max2 on 25/03/2016.
 */
public class TypeIncoherent extends Exception {
    public TypeIncoherent(String t1, String t2){
        System.err.println("type : " + t1 + " n'est pas equivalent à : " + t2);
    }
}
