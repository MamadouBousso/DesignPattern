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



    public Maison construireMaisonSimple(List<int> MurDim,List<int> FenDim,String matiere){
        
        return new 
    }

}
