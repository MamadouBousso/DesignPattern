package bousso;

public class BPSingleton {

    private BPSingleton(){

    }
    private static class InnerBPS{
        private static final BPSingleton bps = new BPSingleton();
    }

    public static BPSingleton getInstance(){
        
        return InnerBPS.bps;
    }

    
}
