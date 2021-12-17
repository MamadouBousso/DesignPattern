package bousso;

public class Chien extends Animal {

    public Chien(String espece, CrierInterface cri) {
        super(espece, cri);
    }

    @Override
    public void faireCri() {
        // TODO Auto-generated method stub
        this.getCri().crier();
        
    }
    
}
