package good.src;

public class BuilderMur implements BuilderElementMaison {

    private Mur mur;

    

    public BuilderMur(Mur mur) {
        this.mur = mur;
    }

    @Override
    public void concevoir() {
        // TODO Auto-generated method stub
        System.out.println("Je conçois un mur de dimension"+mur.getLargeur()+" "+mur.getLargeur());
    }

    @Override
    public void mesurer() {
        // TODO Auto-generated method stub
        System.out.println("Je mesure un mur");
    }

    @Override
    public void implementer() {
        // TODO Auto-generated method stub
        System.out.println("J'implemente un mur");
    }
    
}
