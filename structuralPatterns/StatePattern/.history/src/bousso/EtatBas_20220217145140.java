package bousso;

public class EtatBas extends Etat{

    public EtatBas(BarrageAbstrait bar) {
        this.bar = bar;
    }

    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        System.out.println("Fermer les valves: "+bar.getQuantite());
        bar.accumulerEau(10);
        
        this.changerEtat();
    }

    @Override
    public void changerEtat() {
        // TODO Auto-generated method stub
        if (this.bar.getQuantite() > Etat.MAX){
            this.bar.setEta(new EtatHaut(bar));

        } else {
            if(this.bar.getQuantite() > Etat.MIN)
            this.bar.setEta(new EtatNormal(bar));
        }
    }
    
}
