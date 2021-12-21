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

        ApplyStream.transformStringFlat(melonLists);
    }
}
