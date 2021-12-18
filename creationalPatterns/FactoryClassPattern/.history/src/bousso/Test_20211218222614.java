package bousso;

public class Test {
    public static void main(String[] args) {
        PizzaFactory fp = new SenPizzaFactory();
        FactoryProducer factprod = new FactoryProducer();
        factprod.setpF(fp);
        
    }
    
}
