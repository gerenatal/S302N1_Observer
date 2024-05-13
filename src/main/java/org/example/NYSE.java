package org.example;
public class NYSE extends Observer {
    public NYSE(StockBroker stockBroker) {
        this.stockBroker = stockBroker;
        this.stockBroker.add(this);
    }
    @Override
    public void update() {
        System.out.println("NYSE notified: Stock market is " + (stockBroker.getState() ? "up" : "down"));
    }
}
