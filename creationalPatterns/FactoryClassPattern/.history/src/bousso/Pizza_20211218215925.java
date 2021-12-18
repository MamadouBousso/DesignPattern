public abstract class Pizza{
    public void createPizza(){
        takeRecipe();
        buyIngredients();
        cookPizza();
    }

    public abstract void takeRecipe();

    public abstract void buyIngredients();

    public abstract void cookPizza();

    
    
}