package bousso;

public class FactoryProducer {

    
    
    public static PizzaFactory createFactory(String origin){
        // TODO Auto-generated method stub
        if (origin == "AM")
        return new AmPizzaFactory();
        if (origin == "SEN")
        return new SenPizzaFactory();
        return null;
    
    }


    
}
