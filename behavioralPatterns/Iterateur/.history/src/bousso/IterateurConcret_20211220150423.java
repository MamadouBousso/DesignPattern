package bousso;

public class IterateurConcret implements Iterateur {
    
    private Repository rp;

    public IterateurConcret(Repository rp) {
        this.rp = rp;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        
        return false;
    }

    @Override
    public MyObj next() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
