package org.example;
import java.util.ArrayList;
import java.util.List;
public class StockBroker {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean state;
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
        notifyAllObservers();
    }
    public void add(Observer observer) {
        observers.add(observer);
    }
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
