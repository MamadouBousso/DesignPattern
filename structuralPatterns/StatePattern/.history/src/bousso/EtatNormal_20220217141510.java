package bousso;

public class EtatNormal extends Etat{

    public EtatNormal(Barrage bar) {
        this.bar = bar;
    }


    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        
        System.out.println("Ne rien faire");
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        if (this.bar.getQuantite() > Etat.MAX){
            this.bar.setEta(new EtatHaut(bar));

        } else {
            if(this.bar.getQuantite() < Etat.MIN)
            this.bar.setEta(new EtatBas(bar));
        }
    }
    
}
