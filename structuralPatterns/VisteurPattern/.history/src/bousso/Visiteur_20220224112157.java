package bousso;

public class Visiteur implements IVisiteur{

    

    @Override
    public void visitElementRep(IElement resp) {
        // TODO Auto-generated method stub
        resp.acceptVisiteur(this);
    }

    @Override
    public void visitElementFic(IElement fic) {
        // TODO Auto-generated method stub
        fic.acceptVisiteur(this);
    }
    
}
