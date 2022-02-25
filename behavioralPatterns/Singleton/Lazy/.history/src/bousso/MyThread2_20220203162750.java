package bousso;

public class MyThread2 implements Runnable{
    private LazySingleton lsmt;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        lsmt = LazySingleton.getInstance();
        System.out.println("Here is the singleton object "+lsmt);
        
    }
    
}
