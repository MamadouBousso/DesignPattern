package bousso;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println( TailRec.factorialtail(4));
        List<String> L = ApplyStream.transformString(List({"test","Mamadou","Bousso"}));
        for(String s:L)
        System.out.println(s);
    }
}
