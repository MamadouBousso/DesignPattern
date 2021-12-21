package bousso;


import java.util.List;
import java.util.stream.Collectors;

public class ApplyStream {
    public static List<String> transformString(List<String> test){
        return test.stream().map((a)->a.toUpperCase()).collect(Collectors.toList<String>());
    }
    
}
