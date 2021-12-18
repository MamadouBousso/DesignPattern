package bousso;

public class FactoryProducer {

    private PizzaFactory pF;

    public PizzaFactory getpF() {
        return pF;
    }

    public void setpF(PizzaFactory pF) {
        this.pF = pF;
    }
    public static PizzaFactory createFactory(String origin){
        // TODO Auto-generated method stub
        if (origin == "AM")
        return new AmPizzaFactory();
        if (origin == "SEN")
        return new SenPizzaFactory();
        return null;
    
    }


    
}
