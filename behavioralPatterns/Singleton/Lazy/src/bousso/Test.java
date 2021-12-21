package bousso;

public class Test {
    public static void main(String[] args) {
       
        MyThread2 th1 = new MyThread2();
        
        th1.run();
        
        MyThread2 th2 = new MyThread2();
        th2.run();

        



    }
    
}
