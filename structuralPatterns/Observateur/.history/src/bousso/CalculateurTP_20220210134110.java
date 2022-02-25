package bousso;

public class CalculateurTP extends ObservateurAbstrait {
    
    private float TP;
    private GestionTemps gt;

    public CalculateurTP(GestionTemps ges){
        this.gt = ges;
    }

    public float getTP(){
        return TP;
    }

    public void setTP(float tempress){
        this.TP = tempress;
    }

    public void update(){
        this.setTP(2*this.getSujet().getTemperature()+3*this.getSujet().getPression());
    }


}
