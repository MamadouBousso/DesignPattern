package demo2;
import java.util.ArrayList;

public class GestionTemps extends SujetAbstrait{

    private float temp;
    
    public GestionTemps() {
        
        this.setListObs(new ArrayList<IObserver>());
    }
    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
        this.notifier();
    }
    public float getHum() {
        return hum;
    }
    public void setHum(float hum) {
        this.hum = hum;
        this.notifier();
    }
    public float getPression() {
        return pression;
    }
    public void setPression(float pression) {
        this.pression = pression;
        this.notifier();
    }
    private float hum;
    private float pression;

    public void notifier(){
        for(IObserver o: this.getListObs()){
            o.update();
        }
    }
    
}
