package bousso;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyStream {
    public static List<String> transformString(List<String> test){
        return test.stream().map((a)->a.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> transformStringFlat(List<List<String>> test){
        return (List<String>) ((test.stream().flatMap(Collection::stream)).collect(Collectors.toList())).stream().map((a)->a.toUpperCase());
    }

    
    
}
