package demo;



public class GestionTemps extends SujetAbstrait{

    private float temp;
    
    public GestionTemps(float temp, float hum, float pression) {
        this.temp = temp;
        this.hum = hum;
        this.pression = pression;
    }
    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getHum() {
        return hum;
    }
    public void setHum(float hum) {
        this.hum = hum;
    }
    public float getPression() {
        return pression;
    }
    public void setPression(float pression) {
        this.pression = pression;
    }
    private float hum;
    private float pression;

    public void notifier(){
        for(IObserver o: listObs){
            o.update();
        }
    }
    
}
