public class GestionTemps extends SujetAbstrait {

    private float temperature;
    private float humidite;
    private float pression;

    public GestionTemps(){
        this.listObs = new ArrayList<ObservateurAbstrait>();
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidite(){
        return this.humidite;
    }

    public float getPression(){
        return this.pression;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
    }

    public void setPression(float press){
        this.pression = press;
    }
    public void setHumidite(float hum){
        this.humidite = hum;
    }
}

