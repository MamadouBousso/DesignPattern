package bousso;

public class EtatHaut extends Etat{

    

    public EtatHaut(Barrage bar) {
        this.bar = bar;
    }

    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        System.out.println("Ouvrir les valves");
        bar.ecoulerEau(10);
        if (bar.getQuantite() < Etat.MAX)
        this.changerEtat();
        

        
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        if (this.bar.getQuantite() < Etat.MIN){
            this.bar.setEta(new EtatBas(bar));

        } else {
            if(this.bar.getQuantite() > Etat.MIN)
            this.bar.setEta(new EtatNormal(bar));
        }
    }
    
}
