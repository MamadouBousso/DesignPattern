package bousso;
public class CalculateurTP extends ObservateurAbstrait {
    
    private float TP;

   /* public CalculateurTP(){
        this.gt = ges;
    }*/

    public float getValue(float val){
        return val;
    }

    

    public void update(float temp, float pression, float hum){
        this.TP = 2*temp+3*pression;
    }

}
