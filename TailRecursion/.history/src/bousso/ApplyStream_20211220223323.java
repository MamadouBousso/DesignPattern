package bousso;


import java.util.List;
import java.util.stream.Collectors;

public class ApplyStream {
    public static String transformString(List<String> test){
        test.stream().map((a)->a.toUpperCase()).collect(Collectors.toList<String>());
    }
    
}
