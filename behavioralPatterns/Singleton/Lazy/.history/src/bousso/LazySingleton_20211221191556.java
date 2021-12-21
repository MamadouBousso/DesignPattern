package bousso;

import java.io.Serializable;

/**
 * Probleme cet application n'est Singleton qu'avec les Single thread
 * En cas de thread multiple, elle n'est plus singleton
 */
public class LazySingleton implements Serializable{

    public static final long serialVersionUID = -2020L;
    private static LazySingleton ls;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (ls == null) return new LazySingleton();
        else return ls;
    }
   

}