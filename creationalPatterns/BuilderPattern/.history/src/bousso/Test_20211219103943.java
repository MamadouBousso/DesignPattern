package bousso;

public class Test {
    public static void main(String[] args) {
        MealBuilder ml = new MealBuilderImpl();
        ml.prepareNonVeggieMeal();
        ml.prepareVeggieMeal();
    }
    
}
