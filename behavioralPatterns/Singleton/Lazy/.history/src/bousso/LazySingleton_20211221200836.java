package bousso;

import java.io.Serializable;

/**
 * Probleme cet application n'est Singleton qu'avec les Single thread
 * En cas de thread multiple, elle n'est plus singleton
 */
/** Probleme: la serialisation et la desserialisation d'un singleton 
 * ne donne pas la meme instance.
 * On peut utiliser la methode readResolve pour resoudre ce probleme
 */
public class LazySingleton implements Serializable{

    public static final long serialVersionUID = -2020L;

    private static LazySingleton ls;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (ls == null) return new LazySingleton();
        else return ls;
    }
    protected Object  readResolve(){
        LazySingleton instance = getInstance();
        return instance;
        

    }
   

}