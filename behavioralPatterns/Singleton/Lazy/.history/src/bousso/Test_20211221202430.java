package bousso;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
       
        //MyThread3 th1 = new MyThread3();
        
        //th1.run();
        
        //MyThread3 th2 = new MyThread3();
        //th2.run();

        //ReflectionApp ra = new ReflectionApp();
        //ra.reflectBSP();
        /*LazySingleton ls = LazySingleton.getInstance();
        SerDerSingleton.compareSerialization(ls);*/
        CloneSingleton cs = CloneSingleton.getInstance();
        CloneSingleton cs2 = (CloneSingleton) cs.clone();
        System.out.println(cs);
        System.out.println(cs2);




        



    }
    
}
