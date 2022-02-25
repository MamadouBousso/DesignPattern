package bousso;

public class Test {
    public static void main(String[] args){
        GestionTemps subj = new GestionTemps();
        ObservateurAbstrait obs = new CalculateurTP();
        subj.register(obs);
        subj.setPression(12);
        subj.setTemperature(14);
        int  i = 0;
        while (i < 50 ){
            subj.setPression(subj.getPression()+i);
            subj.setTemperature(subj.getTemperature()+i);
            obs.update();
            System.out.println(obs.getTP());
            i++;  
        }
        
        

    }

    
}
