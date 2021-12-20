package bousso;

public class Repository extends AbstractContainer {

    private MyObj[] tab;

    public Repository(MyObj[] tab) {
        this.tab = tab;
    }

    @Override
    public Iterateur getIterator() {
        // TODO Auto-generated method stub
        return new IterateurConcret();
    }

    private class IterateurConcret implements Iterateur{
        int index ; 
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return index < tab.length;
        }

        @Override
        public MyObj next() {
            // TODO Auto-generated method stub
            if (this.hasNext())
            return tab[index++];
            return null;
        }

    }
    
}
