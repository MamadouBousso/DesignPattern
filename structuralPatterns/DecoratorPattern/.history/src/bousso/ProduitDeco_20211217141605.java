package bousso;

public class ProduitDeco extends Produit{

    private Lait lt;

    public ProduitDeco(String name,int price) {
        super(lt.getName() + name,price);
    }

    @Override
    public int calculerPrix() {
        // TODO Auto-generated method stub
        this.setPrice(lt.getPrice()+this.getPrice());
        return this.getPrice();
    }
    
}
