package bousso;

public class MyThread2 implements Runnable{
    private LazySingletonMultiThread lsmt;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        lsmt = LazySingletonMultiThread.getInstance();
        System.out.println("Here is the singleton object "+lsmt);
        
    }
    
}
