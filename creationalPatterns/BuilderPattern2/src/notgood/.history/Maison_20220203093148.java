public class Maison{
    
    private String[] portes;

    private String[] fenetres;

    private String[] murs;

    public Maison(String[] portes, String[] fenetres, String[] murs) {
        this.portes = portes;
        this.fenetres = fenetres;
        this.murs = murs;
    }



    public String[] getPortes() {
        return portes;
    }

    public String[] getMurs() {
        return murs;
    }

    public void setMurs(String[] murs) {
        this.murs = murs;
    }

    public String[] getFenetres() {
        return fenetres;
    }

    public void setFenetres(String[] fenetres) {
        this.fenetres = fenetres;
    }

    public void setPortes(String[] porte) {
        this.portes = porte;
    }
}