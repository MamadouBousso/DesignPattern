package bousso;

public abstract class ObservateurAbstrait {

    private SujetAbstrait sujet;

    public SujetAbstrait getSujet(){
        return sujet;
    }

    public void setSujet(SujetAbstrait suj){
        this.sujet = suj;;
    }

    public abstract void update();

}
