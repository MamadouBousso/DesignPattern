package bousso;

public class LazySingletonMultiThread {

    private static synchronized LazySingletonMultiThread lsmt;

    private LazySingletonMultiThread(){}

    public LazySingletonMultiThread getInstance(){
        if (lsmt == null){
            lsmt = new LazySingletonMultiThread();
        }
        return lsmt;
    }
    
}
