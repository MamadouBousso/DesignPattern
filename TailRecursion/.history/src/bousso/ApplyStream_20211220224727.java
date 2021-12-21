package bousso;


import java.util.List;
import java.util.stream.Collectors;

public class ApplyStream {
    public static List<String> transformString(List<String> test){
        return test.stream().map((a)->a.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> transformString2( test){
        return test.stream().flatmap((a)->a.toUpperCase()).collect(Collectors.toList());
    }
    
}