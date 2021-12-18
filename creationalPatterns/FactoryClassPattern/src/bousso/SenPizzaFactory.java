package bousso;

public class SenPizzaFactory extends PizzaFactory {

    @Override
    public Pizza getPizza(String origin) {
        // TODO Auto-generated method stub
        if (origin == "DKR")
        return new DakarPizza();
        if (origin == "Thies")
        return new ThiesPizza();
        return null;
    }
    
}
