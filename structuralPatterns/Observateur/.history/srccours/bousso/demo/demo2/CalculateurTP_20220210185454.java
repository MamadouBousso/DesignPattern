package demo2;

public class CalculateurTP implements IObserver{

    private float val;

    private GestionTemps gt;

    public CalculateurTP(GestionTemps gt) {
        this.gt = gt;
    }

    public void update(){
        val = 2*gt.getTemp()+3*gt.getPression();
    }
    public float getValue(){
        return val;
    }

}
