package bousso;

public class Test {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilderImpl();
        Meal ml1 = mb.prepareNonVeggieMeal();
        Meal ml2 = mb.prepareVeggieMeal();
        
    }
    
}
