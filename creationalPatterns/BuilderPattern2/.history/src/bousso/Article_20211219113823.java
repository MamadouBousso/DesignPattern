package bousso;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
public class Article{
    private long id;
    private String title;
    private List<String> tags;
}