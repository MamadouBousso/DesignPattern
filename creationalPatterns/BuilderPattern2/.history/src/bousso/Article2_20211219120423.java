package bousso;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@Getter
@Builder
public class Article2{
    @NonNull
    private long id;
    private String title;
    @Singular
    private List<String> tags;
}