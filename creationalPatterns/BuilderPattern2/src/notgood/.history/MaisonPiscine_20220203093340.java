public class MaisonPiscine extends Maison {
    private String piscine;

    public MaisonPiscine(String[] portes, String[] fenetres, String[] murs,String piscine) {
        super(portes,fenetres,murs);
        this.piscine = piscine;
    }
}
