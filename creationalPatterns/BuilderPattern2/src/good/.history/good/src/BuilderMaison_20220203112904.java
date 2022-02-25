package good.src;

import java.util.ArrayList;
import java.util.List;

public class BuilderMaison {

    private List<BuilderElementMaison> builders;

    

    

    public BuilderMaison(BuilderMur bm, BuilderPiscine bp, BuilderFenetre bf) {
        builders = new ArrayList();
        builders.add(bm);
        builders.add(bp);
        builders.add(bf);
    }



    public Maison construireMaisonSimple(){
        
        builders[0].concevoir();
        builders[0].mesurer();
        builders[0].implementer();
        builders[1].concevoir();
        builders[1].mesurer();
        builders[1].implementer();
        builders[2].concevoir();
        builders[2].mesurer();
        builders[2].implementer();
        return new Maison()
    }

}
