package bousso;

public abstract class ObservateurAbstrait {

    private SujetAbstrait sujet;

    public SujetAbstrait getSujet(){
        return sujet;
    }

    public abstract void update();

}
