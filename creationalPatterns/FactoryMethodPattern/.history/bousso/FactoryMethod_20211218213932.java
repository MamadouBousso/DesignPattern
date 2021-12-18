package bousso;

public class FactoryMethod{
    public static Pizza createPizza(String  pays){
        switch(pays){
            case "AM":
            return new AmericanPizza();
            case "SN":
            return new SenegalesePizza();
            
        }
        return new SenegalesePizza();

    }
}