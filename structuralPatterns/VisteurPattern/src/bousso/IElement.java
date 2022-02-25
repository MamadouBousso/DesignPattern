package bousso;
public interface IElement{
    public void acceptVisiteur(IVisiteur vis);
    public void print();
    public int getTaille();
    public void setTaille(int taille);
}