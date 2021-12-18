package bousso;

public class Test {
    public static void main(String[] args) {
        PizzaFactory pf = FactoryProducer.createFactory("AM");
        pf.getPizza("CAL");
        
    }
    
}
