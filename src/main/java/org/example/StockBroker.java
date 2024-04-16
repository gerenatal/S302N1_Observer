import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean state;
    public boolean getState(){
        return state;
    }
    public void setState(double state){
        this.state = state;
        notifyAll(state);
    }
    public void add(Observer observer){
        observers.add(observer);
    }
    @Override
    public void notifyAll(boolean stockGoesUp){
        for(Observer observer : observers){
            observer.update(stockGoesUp);
        }
    }
}
