package bousso;

public class EtatNormal extends Etat{

    public EtatNormal(Barrage bar) {
        this.bar = bar;
    }


    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        bar.accumulerEau(10);
        if (bar.getQuantite() > 200)
        this.changerEtat();
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        
    }
    
}
