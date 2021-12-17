package bousso;

public abstract class Produit{
    
    private int price;
    
    private String name;

    public Produit(String name) {
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