package bousso;

public abstract class Produit{
    private int price;
    private String name;

    public Produit(String name) {
        this.name = name;
    }

    public abstract int calculerPrix();
    

}