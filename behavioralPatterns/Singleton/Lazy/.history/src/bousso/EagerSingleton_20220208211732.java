package bousso;
/**
 * Class Singleton où l'instance est cree au chargement de la classe
 * Probleme 1: L'instance est crée même si elle n'est pas utilisée par la classe cliente
 * Probléme 2: Si la classe utilise beaucoup de ressources et qu'elle genere une exception alors on ne peut pas la capturer
 */
public class EagerSingleton {

    private static final EagerSingleton ES = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        //float a = 2/0;
        return  ES;
    }

    
}
