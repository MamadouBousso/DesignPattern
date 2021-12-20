package bousso;

public class Test {

    public static void main(String[] args) {
        AbstractContainer tes = new Repository();
        //Iterateur iter = tes.getIterator();
        for (Iterateur iter = tes.getIterator();iter.hasNext();)
        System.out.println(iter.next());
        
    }
    
}
