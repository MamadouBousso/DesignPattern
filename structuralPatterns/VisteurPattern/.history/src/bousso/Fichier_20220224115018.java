package bousso;

public class Fichier implements IElement {

    private String nom;

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    private int taille;

    @Override
    public void acceptVisiteur(TailleVisiteur vis) {
        // TODO Auto-generated method stub
        vis.setTaille(this.getTaille());
        
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void print(){
         System.out.println(" Fichier: "+ this.nom + " de taille: "+this.getTaille());
    }
    
}