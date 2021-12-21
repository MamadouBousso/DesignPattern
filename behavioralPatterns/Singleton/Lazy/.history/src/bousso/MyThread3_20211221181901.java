package bousso;

public class MyThread3 implements Runnable {
    private BPSingleton bps;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        bps = BPSingleton.getInstance();
        System.out.println("Here is the singleton object "+bps);
    }
    
}
