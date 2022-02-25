package bousso;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
       
        MyThread1 th1 = new MyThread1();
        
        th1.run();
        
        MyThread2 th2 = new MyThread2();
        
        th2.run();

        //MyThread3 th3 = new MyThread3();
        
        //th3.run();
        
        //MyThread3 th4 = new MyThread3();
        //th4.run();

        //ReflectionApp ra = new ReflectionApp();
        //ra.reflectBSP();
        /*LazySingleton ls = LazySingleton.getInstance();
        SerDerSingleton.compareSerialization(ls);*/
        //CloneSingleton cs = CloneSingleton.getInstance();
        //CloneSingleton cs2 = (CloneSingleton) cs.clone();
        //System.out.println(cs);
        //System.out.println(cs2);
        EagerSingletonExcept  es = EagerSingletonExcept.getInstance();
        System.out.println(es);



        



    }
    
}
