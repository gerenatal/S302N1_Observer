package org.example;

public interface Observable {
    void addObserver(StockMarketAgency a);
    void removeObserver(StockMarketAgency a);
    void notifyObservers();
    void setStockPrice(double a);
}
