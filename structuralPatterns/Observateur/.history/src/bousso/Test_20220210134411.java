package bousso;

public class Test {
    public static void main(String[] args){
        GestionTemps subj = new GestionTemps();
        CalculateurTP obs = new CalculateurTP(subj);
        subj.register(obs);
        subj.setPression(12);
        subj.setTemperature(14);
        int  i = 0;
        while (True ){
            subj.setPression(subj.getPression()+i);
            subj.setTemperature(subj.getTemperature()+i);
            obs.update();
            System.out.println(obs.getTP());
            i++;  
        }
        
        

    }
    
}
