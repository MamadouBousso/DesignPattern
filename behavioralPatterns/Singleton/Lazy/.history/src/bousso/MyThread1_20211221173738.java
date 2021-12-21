package bousso;

public class MyThread1 extends Thread{
    private LazySingleton ls;
    public void run(){
        ls = LazySingleton.getInstance();
        System.out.println(ls);
        ls.testS();
    }
}
