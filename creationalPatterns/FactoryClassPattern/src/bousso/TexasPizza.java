package bousso;

public class TexasPizza extends Pizza implements AmericanPizza {

    @Override
    public void takeRecipe() {
        // TODO Auto-generated method stub
        System.out.println("Take my Texas Pizza recipe");
    }

    @Override
    public void buyIngredients() {
        // TODO Auto-generated method stub
        System.out.println("Buy ingredients for my Texas  Pizza recipe");
    }

    @Override
    public void cookPizza() {
        // TODO Auto-generated method stub
        System.out.println("Cook my Texas Pizza recipe");
    }
    
}
