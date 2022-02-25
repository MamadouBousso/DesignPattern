public abstract class Produit{

    private String name;
    private int prix;

    
    public Produit(String name, int prix) {
        this.name = name;
        this.prix = prix;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }



}