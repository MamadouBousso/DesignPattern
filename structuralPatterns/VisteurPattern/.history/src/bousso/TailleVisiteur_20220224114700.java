package bousso;

public class TailleVisiteur implements IVisiteur{

    private int taille;

    public TailleVisiteur() {
        this.taille = 0;
    }

    @Override
    public void visitElementRep(Dossier resp) {
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
    public void visitElementFic(Fichier fic) {
        // TODO Auto-generated method stub
      fic.acceptVisiteur(this);
    }
    
}
