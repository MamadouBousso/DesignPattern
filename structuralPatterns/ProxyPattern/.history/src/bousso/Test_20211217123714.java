package bousso;

public class Test {
    public static void main(String[] args) {
        String filename = "test.jpg";
        ProxyImage pyImage = new ProxyImage(filename);
        pyImage.display();
    }
    
}
