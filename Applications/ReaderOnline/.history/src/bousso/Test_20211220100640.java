package bousso;

public class Test {
    public static void main(String[] args) {
        Book b = Book.getInstance();
        Book c = Book.getInstance();
        System.out.println(b==c);
    }
}
