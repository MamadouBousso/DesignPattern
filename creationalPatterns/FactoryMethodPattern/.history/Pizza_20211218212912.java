public abstract class Pizza {
    public void preparerPizza(){
        takeRecipe();
        buyIngredients();
    }

    public abstract void takeRecipe();

    public abstract void buyIngredients();
    
}
