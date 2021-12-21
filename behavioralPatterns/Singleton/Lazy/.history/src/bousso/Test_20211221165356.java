package bousso;

public class Test {
    public static void main(String[] args) {
        LazySingleton ls  = LazySingleton.getInstance();
        MyThread1 th1 = new MyThread1();
        th1.start();
    }
    
}
