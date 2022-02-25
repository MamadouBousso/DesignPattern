package bousso;

public class Test {
    public void main(String[] args){
        GestionTemps subj = new GestionTemps();
        ObservateurAbstrait obs = new CalculateurTP(subj);
        subj.register(obs);
        subj.setPression(12);
        subj.setTemperature(14);

    }
    
}
