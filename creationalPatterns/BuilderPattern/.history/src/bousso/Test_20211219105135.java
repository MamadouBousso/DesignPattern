package bousso;

public class Test {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilderImpl();
        Meal ml1 = mb.prepareNonVeggieMeal();
        Meal ml2 = mb.prepareVeggieMeal();
        System.out.println(ml1);
        System.out.println(ml1.getPrice());
        System.out.println(ml2.toString());
        System.out.println(ml2.getPrice());
    }
    
}
