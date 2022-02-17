package bousso;

public class Barrage extends BarrageAbstrait{

    

    public Barrage() {
        this.quantite = 0;
        this.setEta(null);
    }

    

    public void gererNiveau(){
        this.getEta().gererBar();
    }
    

}