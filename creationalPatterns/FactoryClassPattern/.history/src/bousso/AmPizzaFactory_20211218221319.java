package bousso;

public class AmPizzaFactory extends PizzaFactory {
    @Override
    public Pizza getPizza(String origin) {
        // TODO Auto-generated method stub
        if (origin == "CAL")
        return new CaliforniaPizza();
        if (origin == "Tex")
        return new TexasPizza();
        return null;
    }
}
