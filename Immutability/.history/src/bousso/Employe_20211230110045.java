package bousso;

public final class Employe{
    
    private final String prenom;
    
    private final String nom;

    private final Address addr;

    public Employe(String prenom, String nom,Address addr) {
        this.prenom = prenom;
        this.nom = nom;
        Address cloneaddress = new Address(addr.getCity(),addr.getState());
        
        this.addr = cloneaddress;
        
    }

    public Address getAddr() {
        
        return new Address(addr.city,addr.state);
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getNom() {
        return nom;
    }
    public String toString(){
        return this.getPrenom()+" "+this.getNom();
    }
    
}