package bousso;

public class Test {
    public static void main(String[] args) {
        String filename = "test.jpg";
        Image pyImage = new ProxyImage(filename);
        pyImage.display();
        System.out.println(" ");
        pyImage.display();
    }
    
}
