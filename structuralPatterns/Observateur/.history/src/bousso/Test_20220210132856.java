package bousso;

public class Test {
    public void main(String[] args){
        GestionTemps subj = new GestionTemps();
        CalculateurTP obs = new CalculateurTP(subj);
        subj.register(obs);
        subj.setPression(12);
        subj.setTemperature(14);
        System.out.println(obs.getTP());  

    }
    
}
