package bousso;

public class Lait extends Produit{

    public Lait(String name,int price) {
        super(name,price);
    }

    @Override
    public int calculerPrix() {
        // TODO Auto-generated method stub
        return this.getPrice();
    }
    
}
