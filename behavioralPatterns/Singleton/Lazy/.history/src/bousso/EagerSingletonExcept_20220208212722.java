package bousso;
/**
 * Class Singleton où l'instance est cree au chargement de la classe
 * Probleme 1: L'instance est crée même si elle n'est pas utilisée par la classe cliente
 * Ici on resout le probléme de l'exception en le gerant avec un bloc
 */
public class EagerSingletonExcept {

    private static final EagerSingletonExcept ES ;

    private EagerSingletonExcept(){

    }
    static {
        try {
            ES = new EagerSingletonExcept();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception catched");
        }

    }

    public static EagerSingletonExcept getInstance(){
        float a = 2/0;
        return  ES;
    }

    
}
