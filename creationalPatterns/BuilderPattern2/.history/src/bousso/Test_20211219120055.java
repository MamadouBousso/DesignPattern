package bousso;

import java.util.Collections;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test {
    public static void main(String[] args) {
        Article a = Article.builder().id(1L).title("jouet").tags(Collections.singletonList("Demo")).build();
        System.out.println(a);
    }
    
}
