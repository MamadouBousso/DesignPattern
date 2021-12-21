package bousso;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println( TailRec.factorialtail(4));

        List<String> L = ApplyStream.transformString(Arrays.asList("test","Mamadou","Bousso"));
        for(String s:L)
        System.out.println(s);

        List<List<String>> melonLists = Arrays.asList(
            Arrays.asList("Gac", "Cantaloupe"),
            Arrays.asList("Hemi", "Gac", "Apollo"),
            Arrays.asList("Gac", "Hemi", "Cantaloupe"));

        List<String> a = ApplyStream.transformStringFlat(melonLists);
        List<String> af = ApplyStream.transformStringFilter(a);
        System.out.println(af);
        List<List<Integer>> integerLists = Arrays.asList(
            Arrays.asList(2, 3),
            Arrays.asList(5, -5, 10),
            Arrays.asList(0, -10, 3));
          System.out.println(ApplyStream.summingList(integerLists));
          TailRecTest t = new TailRecTest();
          t.testFactorialtail();
        }
}
