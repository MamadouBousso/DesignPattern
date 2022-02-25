package bousso;

public class Test {
    public void main(String[] args){
        SujetAbstrait subj = new GestionTemps();
        ObservateurAbstrait obs = new CalculateurTP(subj);
        subj.register(obs);
    }
    
}
