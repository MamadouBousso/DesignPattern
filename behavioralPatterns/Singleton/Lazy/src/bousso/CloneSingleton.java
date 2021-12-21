package bousso;
/** Probleme: cloner un singleton peut briser l'unicité de l'instance
 * Solution: retourner l'instance dans clone
 */
public class CloneSingleton extends CloneParent {
    
    private static final CloneSingleton instance = new CloneSingleton();

    private CloneSingleton(){

    }

    public static CloneSingleton getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return instance;
    }
    
}
