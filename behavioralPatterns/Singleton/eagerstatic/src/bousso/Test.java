package src.bousso;
public class Test {
    public static void main(String[] args) {
        StaticSingleton st = StaticSingleton.getInstance();
        StaticSingleton st1 = StaticSingleton.getInstance();
        System.out.println(st==st1);
        
    }
}
