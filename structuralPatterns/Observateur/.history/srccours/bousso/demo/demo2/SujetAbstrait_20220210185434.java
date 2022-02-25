

package demo2;
import java.util.List;



public abstract class SujetAbstrait{

    private List<IObserver> listObs;

    public List<IObserver> getListObs() {
        return listObs;
    }

    public void setListObs(List<IObserver> listObs) {
        this.listObs = listObs;
    }

    public void register(IObserver obs){
        listObs.add(obs);
    }

    public void unregister(IObserver obs){
        if(listObs.contains(obs)){
            listObs.remove(obs);
        }
    }

    public abstract void notifier();

}