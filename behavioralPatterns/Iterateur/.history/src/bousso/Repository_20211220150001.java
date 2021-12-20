package bousso;

public class Repository extends AbstractContainer {
    private MyObj[] tab;

    @Override
    public Iterateur getIterator() {
        // TODO Auto-generated method stub
        return new IterateurConcret();
    }

    public MyObj[] getTab() {
        return tab;
    }

    public void setTab(MyObj[] tab) {
        this.tab = tab;
    }
    
}
