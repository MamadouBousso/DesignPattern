package bousso;

public class EtatHaut extends Etat{

    

    public EtatHaut(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        bar.ecoulerEau(10);
        if (bar.getQuantite() < 200)
        changerEtat();
        

        
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        bar.setEta(new EtatNormal(bar));
    }
    
}
