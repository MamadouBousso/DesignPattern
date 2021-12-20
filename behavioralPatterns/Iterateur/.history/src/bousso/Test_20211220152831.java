package bousso;

public class Test {

    public static void main(String[] args) {
        AbstractContainer tes = new Repository();
        Iterateur iter = tes.getIterator();
        System.out.println(iter.next());
    }
    
}
