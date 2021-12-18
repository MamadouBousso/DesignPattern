public abstract class Game{
    public abstract void initialize();
    public abstract void startplay();
    public abstract void endplay();
    public final void play(){
        initialize();
        startplay();
        endplay();
    }

}