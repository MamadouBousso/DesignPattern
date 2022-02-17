package bousso;

public class EtatBas extends Etat{

    public EtatBas(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        System.out.println("Fermer les valves");
        bar.accumulerEau(10);
        if (bar.getQuantite() > 100)
        this.changerEtat();
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        bar.setEta(new EtatNormal(bar));
    }
    
}
