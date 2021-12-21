public final class Employe{
    
    private final String prenom;
    
    private final String nom;

    private final Address addr;

    public Employe(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getNom() {
        return nom;
    }
    
    
}