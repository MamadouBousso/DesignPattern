package bousso;

public class EtatNormal extends Etat{

    public EtatNormal(BarrageAbstrait bar) {
        this.bar = bar;
    }


    @Override
    public void gererBar() {
        // TODO Auto-generated method stub
        
        System.out.println("Accumulation naturelle: "+bar.getQuantite());
        this.bar.accumulerEau(5);
        changerEtat();
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
