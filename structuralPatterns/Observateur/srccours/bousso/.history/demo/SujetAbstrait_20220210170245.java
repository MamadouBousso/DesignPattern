package demo;

import java.util.List;

public abstract class SujetAbstrait{
    private List<IObserver> listObs;

    public void register(IObserver obs){
        listObs.add(obs);
    }

    public void unregister(IObserver obs){
        if(listObs.contains(obs)){
            listObs.remove(obs);
        }
    }

}