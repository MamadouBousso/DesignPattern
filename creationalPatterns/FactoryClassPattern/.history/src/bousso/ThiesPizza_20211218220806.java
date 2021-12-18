package bousso;

public class ThiesPizza extends Pizza implements SenegalesePizza {
    @Override
    public void takeRecipe() {
        // TODO Auto-generated method stub
        System.out.println("Take my Thies Pizza recipe");
    }

    @Override
    public void buyIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Buy ingredients for my Thies Pizza recipe");
    }

    @Override
    public void cookPizza() {
        // TODO Auto-generated method stub
        System.out.println("Cook my Thies Pizza recipe");
    }
}
