package bousso;

public abstract class Etat {

    public static final int MAX = 200;
    public static final int MIN = 100;

    protected BarrageAbstrait bar;
    public abstract void gererBar();
    public abstract void changerEtat();
}
