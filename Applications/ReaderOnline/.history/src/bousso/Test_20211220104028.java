package bousso;

public class Test {
    public static void main(String[] args) {
        Book b = Book.getInstance();
        b.getPages().add("Bonjour");
        b.getPages().add("IA");
        b.getPages().add("Test");
        /*Book c = Book.getInstance();
        System.out.println(b==c);
        Reader r1 = Reader.getInstance();
        Reader r2 = Reader.getInstance();
        System.out.println(r1==r2);*/
    }
}
