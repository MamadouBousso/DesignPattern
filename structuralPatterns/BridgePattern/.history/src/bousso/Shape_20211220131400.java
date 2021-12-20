package bousso;

public abstract class Shape{

    public DrawApi getDrp() {
        return drp;
    }

    public void setDrp(DrawApi drp) {
        this.drp = drp;
    }

    private DrawApi drp;

    private DrawApiRect drpRect;

    

    public Shape(DrawApi drp) {
        this.drp = drp;
    }

    public abstract void Draw();
}