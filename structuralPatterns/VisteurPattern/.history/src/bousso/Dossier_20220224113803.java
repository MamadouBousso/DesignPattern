package bousso;

import java.util.List;
import java.util.Vector;

public class Dossier implements IElement{
    
    private Vector<IElement> elements;


    public Dossier(Vector<IElement> elements) {
        this.elements = elements;
    }

    public void add(IElement elem){
        this.elements.add(elem);
    }

    public boolean remove(IElement elem){
        return this.elements.removeElement(elem);
    }

    public IElement get (int i){
        return this.elements.get(i);
    }

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
