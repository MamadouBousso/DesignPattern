package bousso;

public class ProduitDeco extends Produit{

    private Lait lt;

    public ProduitDeco(Lait lt,String name,int price) {
        super(lt.getName() + " + "+ name,price);
        this.lt = lt;
    }

    @Override
    public int calculerPrix() {
        // TODO Auto-generated method stub
        this.setPrice(lt.getPrice()+this.getPrice());
        return this.getPrice();
    }
    
}
