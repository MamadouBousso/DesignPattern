package bousso;

public class Barrage extends BarrageAbstrait{

    private int quantite;

    private Etat eta;

    public Etat getEta() {
        return eta;
    }

    public void setEta(Etat eta) {
        this.eta = eta;
    }

    public Barrage() {
        this.quantite = 0;
        this.setEta(null);
    }

    public int getQuantite(){
        return this.quantite;
    }

    public void setQuantite(int qte){
        this.quantite = qte;
    }

    public void gererNiveau(){
        this.getEta().gererBar();
    }
    public void accumulerEau(int qte){
        this.setQuantite(this.getQuantite()+qte); 
    }

    public void ecoulerEau(int qte){
        this.setQuantite(this.getQuantite()-qte); 
    }

}