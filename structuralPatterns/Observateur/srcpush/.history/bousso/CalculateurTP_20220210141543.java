package bousso;
public class CalculateurTP extends ObservateurAbstrait {
    
    private float TP;
    //private  gt;

   /* public CalculateurTP(){
        this.gt = ges;
    }*/

    public float getTP(){
        return TP;
    }

    public void setTP(float tempress){
        this.TP = tempress;
    }

    public void update(float temp, float pression, float hum){
        this.getValue(2*temp+3*pression);
    }

}
