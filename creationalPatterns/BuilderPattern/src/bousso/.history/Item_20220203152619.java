package bousso;

public abstract class Item{

    private String name;

    private float price;

    private Packing packing;
    
    public Item(String name, float price, Packing packing) {
        this.name = name;
        this.price = price;
        this.packing = packing;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Packing getPacking() {
        return packing;
    }
    public void setPacking(Packing packing) {
        this.packing = packing;
    }



}