package bousso;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        ls = LazySingleton.getInstance();
        System.out.println("Here is the singleton object "+ls);
        
    }
    
}
