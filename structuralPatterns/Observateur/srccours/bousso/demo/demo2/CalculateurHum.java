package demo2;

public class CalculateurHum implements IObserver{

    private float val;

    private GestionTemps gt;

    public CalculateurHum(GestionTemps subj) {
        this.gt = subj;
    }

    public void update(){
        val = 2*gt.getTemp()+3*gt.getHum();
    }
    public float getValue(){
        return val;
    }

}
