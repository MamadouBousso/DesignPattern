public abstract class Pizza {
    public void preparerPizza(){
        takeRecipe();
        buyIngredients();
        cookPizza();
    }

    public abstract void cookPizza();

    public abstract void takeRecipe();

    public abstract void buyIngredients();
    
}
