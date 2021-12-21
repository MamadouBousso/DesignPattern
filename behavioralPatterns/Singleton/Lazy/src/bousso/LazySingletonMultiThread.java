package bousso;

public class LazySingletonMultiThread {

    private static  LazySingletonMultiThread lsmt;

    private LazySingletonMultiThread(){}

    public synchronized static LazySingletonMultiThread getInstance(){
        if (lsmt == null){
            lsmt = new LazySingletonMultiThread();
        }
        return lsmt;
    }
    
}
