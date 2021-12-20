package bousso;

public abstract class Shape{

    public DrawApi getDrp() {
        return drp;
    }

    public DrawApiRect getDrpRect() {
        return drpRect;
    }

    public void setDrpRect(DrawApiRect drpRect) {
        this.drpRect = drpRect;
    }

    public void setDrp(DrawApi drp) {
        this.drp = drp;
    }

    private DrawApi drp;

    private DrawApiRect drpRect;

    

    public Shape(DrawApi drp) {
        this.drp = drp;
    }
    public Shape(DrawApiRect drp) {
        this.drpRect = drp;
    }


    public abstract void Draw();
}