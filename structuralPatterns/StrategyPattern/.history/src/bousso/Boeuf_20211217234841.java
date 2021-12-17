package bousso;

public class Boeuf extends Animal{

    public Boeuf(String espece, CrierInterface cri) {
        super(espece, cri);
    }

    @Override
    public void faireCri() {
        // TODO Auto-generated method stub
        this.getCri().crier();
    }
    
}
