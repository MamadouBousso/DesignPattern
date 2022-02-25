import java.util.List;

public abstract class SujetAbstrait {

    List<ObservateurAbstrait> listObs;

    public void register(ObservateurAbstrait obs){
        listObs.add(obs);
    }

    public void delete(ObservateurAbstrait obs){
        if (listObs.contains(obs)){
            listObs.remove(obs);
        }
    }
}