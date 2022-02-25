package bousso;
public class CalculateurTP extends ObservateurAbstrait {
    
    

   /* public CalculateurTP(){
        this.gt = ges;
    }*/

    public float getValue(float val){
        return val;
    }

    

    public void update(float temp, float pression, float hum){
        this.getValue(2*temp+3*pression);
    }

}
