public abstract class Animal {

    private String espece;

    private CrierInterface  cri;

    public Animal(String espece,CrierInterface  cri) {
        this.espece = espece;
        this.cri = cri;
    }

    public abstract void faireCri();


}