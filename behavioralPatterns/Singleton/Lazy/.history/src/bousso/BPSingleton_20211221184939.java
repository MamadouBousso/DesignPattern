package bousso;

public class BPSingleton {

    private BPSingleton(){
        if 
    }
    private static class InnerBPS{
        private static final BPSingleton bps = new BPSingleton();
    }

    public static BPSingleton getInstance(){
        
        return InnerBPS.bps;
    }

    
}
