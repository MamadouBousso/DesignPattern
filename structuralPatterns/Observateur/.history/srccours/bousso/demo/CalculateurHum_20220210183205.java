import bousso.GestionTemps;

public class CalculateurHum implements IObserver{

    private float val;

    private GestionTemps gt;

    public CalculateurHum(GestionTemps gt) {
        this.gt = gt;
    }

    public void update(){
        val = 2*gt.getTemperature()+3*gt.getHumidite();
    }
    public float getValue(){
        return val;
    }

}
