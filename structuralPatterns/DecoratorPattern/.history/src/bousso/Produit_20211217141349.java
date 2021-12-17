package bousso;

public abstract class Produit{
    
    private int price;

    private String name;

    public Produit(String name,int price) {
        this.name = name;
        this.setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculerPrix();
    

}