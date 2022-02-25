package bousso;

public class TailleVisiteur implements IVisiteur{

    private int taille;

    @Override
    public void visitElementRep(IElement resp) {
        // TODO Auto-generated method stub
        resp.acceptVisiteur(this);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    @Override
    public void visitElementFic(IElement fic) {
        // TODO Auto-generated method stub
        fic.acceptVisiteur(this);
    }
    
}
