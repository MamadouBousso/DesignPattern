package src.bousso;
public class StaticSingleton{

    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return instance;
    }
    public String toString(){
        return "StaticSingleton";
    }
}