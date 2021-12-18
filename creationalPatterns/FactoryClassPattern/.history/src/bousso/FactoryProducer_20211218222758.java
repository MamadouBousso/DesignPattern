package bousso;

public class FactoryProducer {

    private PizzaFactory pF;

    public PizzaFactory getpF() {
        return pF;
    }

    public void setpF(PizzaFactory pF) {
        this.pF = pF;
    }
    public static createFactory(String origin){
        
    public Pizza getPizzaF(String origin) {
        // TODO Auto-generated method stub
        if (origin == "AM")
        return new AmericanPizza();
        if (origin == "SEN")
        return new SenegalesePizza();
        return null;
    }
    }


    
}
