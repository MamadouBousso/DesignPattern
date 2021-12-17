package bousso;

public class Mouton extends Animal {
    

    public Mouton(String espece,CrierInterface cri) {
        super(espece,cri);
        
    }

    @Override
    public void faireCri() {
        // TODO Auto-generated method stub
        this.getCri().crier();
    }
    
}
