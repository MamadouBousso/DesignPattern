package bousso;

public class EtatBas extends Etat{

    public EtatBas(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        bar.setEta(this);
        changerEtat();
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        bar.
    }
    
}
