package bousso;

public class EtatHaut extends Etat{

    

    public EtatHaut(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererEtat() {
        // TODO Auto-generated method stub
        System.out.println("Ouvrir les valves");
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        
    }
    
}
