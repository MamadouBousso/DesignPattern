package bousso;

public interface IVisiteur {
    public void visitElementRep(Dossier resp);
    public void visitElementFic(Fichier fic);
    public void setTaille(int taille);
    
}
