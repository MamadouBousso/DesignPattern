package bousso;
/**
 * Probleme cet application n'est Singleton qu'avec les Single thread
 * En cas de thread multiple, elle n'est plus singleton
 */
public class LazySingleton {
    private static LazySingleton ls;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (ls == null) return new LazySingleton();
        else return ls;
    }
    public  void testS(){
        System.out.println("Ici the singleton "+ls);
    }

}