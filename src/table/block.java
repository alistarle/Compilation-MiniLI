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

    void addIdentificateur(AbstractIdentificateur a){
        identificateurs.add(a);
    }
}
