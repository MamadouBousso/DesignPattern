package bousso;
public class Test{
    public static void main(String[] args) {
        Address addr = new Address("Dakar","Senegal");
    
        Employe a = new Employe("Bousso","Mamadou",addr);
        System.out.println(a.getAddr().city);
        addr.city ="Paris";
        System.out.println(a.getAddr().city);
        
    }
}