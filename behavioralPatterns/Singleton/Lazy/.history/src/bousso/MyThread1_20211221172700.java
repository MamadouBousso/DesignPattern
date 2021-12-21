package bousso;

public class MyThread1 extends Thread{
    private LazySingleton ls = LazySingleton.getInstance();
    public void run(){
        ls.testS();
    }
}
