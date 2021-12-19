package bousso;

public class MealBuilderImpl implements MealBuilder {



    

    @Override
    public Meal prepareVeggieMeal() {
        // TODO Auto-generated method stub
        Meal plat = new Meal();
        plat.addItem(new VegHamburger("dougoub", 100,new Wrapper() ));
        plat.addItem(new Coke("Coca-cola",200,new Bottle()));
        return plat;
    }

    @Override
    public Meal prepareNonVeggieMeal() {
        // TODO Auto-generated method stub
        Meal plat = new Meal();
        var add = plat.addItem(new MeetHamburger("mouton", 100,new Wrapper() ));
        System.out.println(add);
        plat.addItem(new Coke("Pepsi",200,new Bottle()));
        return plat;
        
    }
    
}
