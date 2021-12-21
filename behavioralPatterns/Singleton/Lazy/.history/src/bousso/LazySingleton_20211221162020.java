package bousso;
public class LazySingleton {
    private LazySingleton ls;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (ls == null) return new LazySingleton();
        else return ls;
    }

}