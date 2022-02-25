

public class Test {
    public static void main(String[] args){
        GestionTemps subj = new GestionTemps();
        ObservateurAbstrait obs = new CalculateurTP();
        ObservateurAbstrait obshum = new CalculateurHum();
        subj.register(obs);
        subj.register(obshum);
        subj.setPression(12);
        subj.setTemperature(14);
        subj.setHumidite(16);
        int  i = 0;
        while (i < 50 ){
            
            obs.update(subj.getTemperature()+i,subj.getPression()+i,subj.getHumidite());
            System.out.println(obs.getValue());
            i++;  
        }
        
        

    }

    
}

