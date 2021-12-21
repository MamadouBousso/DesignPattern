package bousso;

public class BPSingleton {

    private BPSingleton(){
        if (BPSingleton.getInstance() !=  null)
            throw new InstantiationError(" cette classe ne doit pas etre instancié");
    }
    private static class InnerBPS{
        private static final BPSingleton bps = new BPSingleton();
    }

    public static BPSingleton getInstance(){
        
        return InnerBPS.bps;
    }

    
}
