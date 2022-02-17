package bousso;

public abstract class BarrageAbstrait {

    public abstract void gererNiveau();
    public abstract void setEta(Etat et);

    public void accumulerEau(int qte){
        this.setQuantite(this.getQuantite()+qte); 
    }

    public void ecoulerEau(int qte){
        this.setQuantite(this.getQuantite()-qte); 
    }
}
