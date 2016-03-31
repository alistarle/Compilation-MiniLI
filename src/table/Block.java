package table;

import java.util.ArrayList;

/**
 * Created by max2 on 10/03/2016.
 */
public class Block {
    private ArrayList<AbstractIdentificateur> identificateurs;

    Block(){
        identificateurs = new ArrayList<AbstractIdentificateur>();
    }

    public boolean addIdentificateur(AbstractIdentificateur a){

        boolean exists = false;
        for(AbstractIdentificateur ai : identificateurs){
            if(ai.nom == a.nom){
                exists = true;
                break;
            }
        }
        if(!exists){
            identificateurs.add(a);
        }
        return !exists;
    }

    boolean exists(AbstractIdentificateur i){
        return identificateurs.contains(i);
    }
}
