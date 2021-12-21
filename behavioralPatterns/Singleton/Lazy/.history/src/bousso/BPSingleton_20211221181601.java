package bousso;

public class BPSingleton {

    private BPSingleton(){

    }
    private static class InnerBPS{
        private static BPSingleton bps ;
    }

    public static BPSingleton getInstance(){
        InnerBPS.bps = new BPSingleton();
        return bps;
    }

    
}
