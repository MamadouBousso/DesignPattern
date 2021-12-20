package bousso;

public class Repository extends AbstractContainer {

    @Override
    public Iterateur getIterator() {
        // TODO Auto-generated method stub
        return new IterateurConcret();
    }
    
}
