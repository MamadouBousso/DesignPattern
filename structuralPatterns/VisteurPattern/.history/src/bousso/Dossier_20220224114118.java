package bousso;

import java.util.List;
import java.util.Vector;

public class Dossier implements IElement{

    private String nom;
    
    private Vector<IElement> elements;


    public Dossier(Vector<IElement> elements,String nom) {
        this.elements = elements;
        this.nom = nom;
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

    public int getSize(){
        return this.elements.size();
    }

    @Override
    public void acceptVisiteur(IVisiteur vis) {
        // TODO Auto-generated method stub
        vis.visitElementRep(this);
        
    }

    public void print(){
        for (IElement el : elements) {
            
            
        }
    }
    
}
