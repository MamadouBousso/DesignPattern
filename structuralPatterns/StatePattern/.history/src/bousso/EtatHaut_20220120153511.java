package bousso;

public class EtatHaut extends Etat{

    

    public EtatHaut(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        if (bar.getQuantite() <  200) {
            bar.setQuantite(bar.getQuantite()+ 10);
        }

        System.out.println("Ouvrir les valves");
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        if (bar.getQuantite() > 200) {

        }
    }
    
}
