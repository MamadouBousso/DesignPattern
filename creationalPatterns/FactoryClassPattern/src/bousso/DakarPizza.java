package bousso;

public class DakarPizza extends Pizza implements SenegalesePizza {
    @Override
    public void takeRecipe() {
        // TODO Auto-generated method stub
        System.out.println("Take my Dakar Pizza recipe");
    }

    @Override
    public void buyIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Buy ingredients for my Dakar Pizza recipe");
    }

    @Override
    public void cookPizza() {
        // TODO Auto-generated method stub
        System.out.println("Cook my Dakar Pizza recipe");
    }
}
