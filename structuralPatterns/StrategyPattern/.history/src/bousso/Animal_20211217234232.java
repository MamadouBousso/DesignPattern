package bousso;
public abstract class Animal {

    private String espece;

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public CrierInterface getCri() {
        return cri;
    }

    public void setCri(CrierInterface cri) {
        this.cri = cri;
    }

    private CrierInterface  cri;

    public Animal(String espece,CrierInterface  cri) {
        this.espece = espece;
        this.cri = cri;
    }

    public abstract void faireCri();


}