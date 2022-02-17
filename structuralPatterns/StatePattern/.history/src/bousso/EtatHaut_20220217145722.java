package bousso;

public class EtatHaut extends Etat{

    

    public EtatHaut(BarrageAbstrait bar) {
        this.bar = bar;
    }

    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        System.out.println("Ouvrir les valves: "+bar.getQuantite());
        bar.ecoulerEau(20);
        
        this.changerEtat();
        

        
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        if (this.bar.getQuantite() < Etat.MIN){
            this.bar.setEta(new EtatBas(bar));

        } else {
            if(this.bar.getQuantite() < Etat.MAX)
            this.bar.setEta(new EtatNormal(bar));
        }
    }
    
}
