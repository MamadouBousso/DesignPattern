package bousso;

public class Test {
    public static void main(String[] args) {
       
        MyThread3 th1 = new MyThread3();
        
        th1.run();
        
        MyThread3 th2 = new MyThread3();
        th2.run();

        



    }
    
}
