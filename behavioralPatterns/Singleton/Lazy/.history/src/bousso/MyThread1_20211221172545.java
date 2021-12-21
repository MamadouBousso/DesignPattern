package bousso;

public class MyThread1 extends Thread{
    public void run(){
        LazySingleton.getInstance().testS();
    }
}
