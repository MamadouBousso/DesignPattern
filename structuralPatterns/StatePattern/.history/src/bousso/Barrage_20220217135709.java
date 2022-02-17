public class Barrage extends BarrageAbstrait{

    private int quantite;

    private Etat eta;

    public Etat getEta() {
        return eta;
    }

    public void setEta(Etat eta) {
        this.eta = eta;
    }

    public Barrage(int quantite) {
        this.quantite = quantite;
    }

    public int getQuantite(){
        return this.quantite;
    }

    public void setQuantite(int qte){
        this.quantite = qte;
    }

    public void gererNiveau(){
        eta.gererEtat();
    }
    public void accumulerEau(int qte){
        this.quantite += qte;
    }

    public void ecoulerEau(int qte){
        this.quantite -= qte;
    }

}