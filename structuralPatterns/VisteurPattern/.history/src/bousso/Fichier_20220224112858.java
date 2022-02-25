package bousso;

public class Fichier implements IElement {

    private String contenu;
    private int taille;

    @Override
    public void acceptVisiteur(IVisiteur vis) {
        // TODO Auto-generated method stub
        vis.visitElementFic(this);
        
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }
    
}
