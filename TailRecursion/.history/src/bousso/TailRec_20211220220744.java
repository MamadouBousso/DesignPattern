public class TailRec {
    public static long factorialtail(n){
        return factorial(1,n);
    }

    public static factorial(long v,long n){
        return n==1?v:factorial(n*v,n-1);
    }
}