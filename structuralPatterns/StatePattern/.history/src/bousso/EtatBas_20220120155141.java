package bousso;

public class EtatBas extends Etat{

    public EtatBas(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        bar.accumulerEau(10);
        if (bar.getQuantite() > 100)
        this.changerEtat();
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        
    }
    
}
