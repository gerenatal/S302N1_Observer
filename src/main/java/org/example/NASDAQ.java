package org.example;
public class NASDAQ extends Observer {
    public NASDAQ(StockBroker stockBroker) {
        this.stockBroker = stockBroker;
        this.stockBroker.add(this);
    }
    @Override
    public void update() {
        System.out.println("NASDAQ notified: Stock market is " + (stockBroker.getState() ? "up" : "down"));
    }
}
