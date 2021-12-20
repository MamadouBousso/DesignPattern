package bousso;

public class Rectangle extends Shape{

    private float x;
    private float y;

    public Rectangle(DrawApi drp, float x, float y) {
        super(drp);
        this.x = x;
        this.y = y;
    }
    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        this.getDrp().drawRect();
    }
    


    
}
