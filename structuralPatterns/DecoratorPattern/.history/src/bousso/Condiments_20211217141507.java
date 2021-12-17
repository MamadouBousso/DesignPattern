package bousso;

public class ProduitSup extends Produit{

    private Lait lt;

    public Condiments(String name,int price) {
        super(lt.name + name,price);
    }

    @Override
    public int calculerPrix() {
        // TODO Auto-generated method stub
        this.setPrice(lt.getPrice()+this.getPrice());
        return this.getPrice();
    }
    
}
