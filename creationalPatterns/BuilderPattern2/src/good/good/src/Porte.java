package good.src;

public class Porte implements ItemMaison{

    private int longueur;

    private int largeur;

    private String matiere;
    
    public Porte(int longueur, int largeur, String matiere) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.matiere = matiere;
    }
    public int getLongueur() {
        return longueur;
    }
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
    public int getLargeur() {
        return largeur;
    }
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    public String getMatiere() {
        return matiere;
    }
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    
}
