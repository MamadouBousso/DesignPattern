package bousso;

import java.util.List;
import java.util.Vector;

public class Dossier implements IElement{
    
    private Vector<IElement> elements;


    @Override
    public void acceptVisiteur(IVisiteur vis) {
        // TODO Auto-generated method stub
        
    }

    public List<Fichier> getFichiers() {
        return fichiers;
    }

    public void setFichiers(List<Fichier> fichiers) {
        this.fichiers = fichiers;
    }
    
}
