package bousso;

public class Tread1 implements Runnable {
    Variable vari;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        vari.x += 2;
        System.out.println("x = "+vari.x);
    }
    
}
