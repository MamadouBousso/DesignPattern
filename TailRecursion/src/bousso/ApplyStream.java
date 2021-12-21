package bousso;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyStream {
    

    public static List<String> transformString(List<String> test){
        return test.stream().map((a)->a.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> transformStringFlat(List<List<String>> test){
        List<String> L = (test.stream().flatMap(Collection::stream)).distinct().collect(Collectors.toList());
        return L.stream().map((a)->a.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> transformStringFilter(List<String> test){
       
        return test.stream().filter((a)->a.startsWith("H")).collect(Collectors.toList());
    }

    /** Sum a list of list of Integer */

    public static int summingList(List<List<Integer>> mat){
        return mat.stream().flatMap(Collection::stream).filter((a)->a>0).reduce(0,Integer::sum);
    }
    
}
