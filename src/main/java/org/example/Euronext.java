package org.example;
public class Euronext extends Observer {
    public Euronext(StockBroker subject) {
        this.stockBroker = subject;
        this.stockBroker.add(this);
    }
    @Override
    public void update() {
        System.out.println("Euronext notified: Stock market is " + (stockBroker.getState() ? "up" : "down"));
    }
}
