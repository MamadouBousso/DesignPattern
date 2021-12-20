package bousso;
public class TailRec {

    public static long factorialtail(long n){
        return factorial(1,n);
    }

    static long factorial(long v,long n){
        return n==1?v:factorial(n*v,n-1);
    }
}