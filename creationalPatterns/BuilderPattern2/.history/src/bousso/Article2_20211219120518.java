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
    private final long id;
    private String title = "Titre par defaut";
    @Singular
    private List<String> tags;
}