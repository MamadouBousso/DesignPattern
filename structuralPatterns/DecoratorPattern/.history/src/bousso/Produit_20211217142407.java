package bousso;

public abstract class Produit{
    
    private int price;
   
    private String name;

    public Produit(String name,int price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculerPrix();
    

}