

public class Test {
    public static void main(String[] args){
        GestionTemps subj = new GestionTemps();
        IObserver obs = new CalculateurTP();
        IObserver obshum = new CalculateurHum();
        subj.register(obs);
        subj.register(obshum);
        subj.setPression(12);
        subj.setTemp(14);
        subj.setHum(16);
        int  i = 0;
        while (i < 50 ){
            
            
            subj.setPression(subj.getPression()+i);
            subj.setTemp(subj.getTemp()+i);
            subj.setHum(subj.getHum()+i);
            System.out.println(obs.getValue()+"  "+obs.getValue());
            i++;  
        }
        
        

    }

    
}

