package bousso;

public class Test {
    public static void main(String[] args) {
       
        MyThread1 th1 = new MyThread1();
        System.out.println(th1.getName()); 
        th1.start();
        
        MyThread1 th2 = new MyThread1();
        th2.start();

    }
    
}
