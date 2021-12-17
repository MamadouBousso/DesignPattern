package bousso;

public class Condiments extends Produit{

    private Lait lt;

    public Condiments(String name,int price) {
        super(name);
    }

    @Override
    public int calculerPrix() {
        // TODO Auto-generated method stub
        this.setPrice(lt.getPrice()+this.getPrice());
        return this.getPrice();
    }
    
}
