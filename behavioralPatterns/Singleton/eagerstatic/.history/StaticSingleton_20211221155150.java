public class StaticSingleton{

    private static StaticSingleton instance;

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return instance;
    }
    
}