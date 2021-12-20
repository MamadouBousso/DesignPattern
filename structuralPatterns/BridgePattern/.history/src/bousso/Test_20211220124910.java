package bousso;

public class Test {
    public static void main(String[] args) {
        DrawApi drp = new RedCircle();
        Circle c = new Circle(12,drp);
        c.Draw();
    }
    
    
    
}
