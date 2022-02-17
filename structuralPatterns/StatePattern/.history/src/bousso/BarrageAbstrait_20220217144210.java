package bousso;

public abstract class BarrageAbstrait {

    private int quantite;

    private Etat eta;

    public Etat getEta() {
        return eta;
    }

    public int getQuantite(){
        return this.quantite;
    }

    public void setQuantite(int qte){
        this.quantite = qte;
    }

    

    public abstract void gererNiveau();
    public abstract void setEta(Etat et);

    public void accumulerEau(int qte){
        this.setQuantite(this.getQuantite()+qte); 
    }

    public void ecoulerEau(int qte){
        this.setQuantite(this.getQuantite()-qte); 
    }
}
