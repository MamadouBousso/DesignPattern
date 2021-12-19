package bousso;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;
    
    

    public Meal() {
        this.items = new ArrayList<Item>();
    }
    public float getPrice(){
        float price = 0;
        for(Item i: items){
            price += i.getPrice();
        }
        return price;
    }
    public String toString(){
        var name = "";
        for(Item i: items){
            name += " "+i.getName()+" ";
        }
        System.out.println(name);
        return name;

    }
    public boolean addItem(Item ite){
       var add = items.add(ite);
       return add;
    }
    
}
