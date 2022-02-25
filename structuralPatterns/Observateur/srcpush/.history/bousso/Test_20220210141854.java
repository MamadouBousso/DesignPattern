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
            
            obs.update(subj.getTemperature()+i,subj.getPression()+i,subj.getHumidite());
            System.out.println(obs.getValue());
            i++;  
        }
        
        

    }

    
}
