package bousso;

public class CaliforniaPizza extends Pizza implements AmericanPizza {

    @Override
    public void takeRecipe() {
        // TODO Auto-generated method stub
        System.out.println("Take my california Pizza recipe");
    }

    @Override
    public void buyIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Buy ingredients for my california Pizza recipe");
    }

    @Override
    public void cookPizza() {
        // TODO Auto-generated method stub
        System.out.println("Cook my california Pizza recipe");
    }
    
}
