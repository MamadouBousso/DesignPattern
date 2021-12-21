package bousso;

public class Test {
    public static void main(String[] args) {
        Address addr = new Address("Dakar","Senegal");
        Employe emp = new Employe("mamadou","bousso",addr);
        System.out.println(emp.getAddr() == addr);
    }
}
