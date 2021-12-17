public abstract class Animal {

    private String espece;

    private CrierInterface  cri;

    public Animal(String espece) {
        this.espece = espece;
    }

    public abstract void faireCri();


}