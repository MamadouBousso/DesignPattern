package bousso;

public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius,DrawApi drp) {
        super(drp);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        
    }
    
}
