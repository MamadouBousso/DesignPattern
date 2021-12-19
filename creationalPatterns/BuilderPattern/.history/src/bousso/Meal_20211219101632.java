package bousso;

import java.util.List;

public class Meal {

    private List<Item> items;

    public float getPrice(){
        float price = 0;
        for(Item i: items){
            price += i.getPrice();
        }
        return price;
    }
    public String toString(){
        String name = "";
        for(Item i: items){
            name = " "+i.getName()+" ";
        }
        return name;

    }
    
}
