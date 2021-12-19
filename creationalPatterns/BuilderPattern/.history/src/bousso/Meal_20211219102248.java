package bousso;

import java.util.List;

public class Meal {

    private List<Item> items;
    
    private boolean add;

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
            name = " "+i.getName()+" ";
        }
        return name;

    }
    public boolean addItem(Item ite){
       add = items.add(ite);
       return add;
    }
    
}
