package bousso;

public class MyThread1 extends Thread{
    private LazySingletonMultiThread ls;
    public void run(){
        ls = LazySingletonMultiThread.getInstance();
        System.out.println("Here is the singleton object "+ls);
        
    }
}
