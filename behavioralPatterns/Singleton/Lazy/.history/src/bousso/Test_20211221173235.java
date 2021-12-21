package bousso;

public class Test {
    public static void main(String[] args) {
       
        MyThread1 th1 = new MyThread1();
        th1.start();
        th1.run();
        //MyThread1 th2 = new MyThread1();
        //th2.start();

    }
    
}
