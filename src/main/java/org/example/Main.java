package org.example;
public class Main {
    public static void main(String[] args) {
        StockBroker stockBroker = new StockBroker();

        NASDAQ nasdaq = new NASDAQ(stockBroker);
        NYSE nyse = new NYSE(stockBroker);
        Euronext euronext = new Euronext(stockBroker);

        stockBroker.setState(true);
        stockBroker.setState(false);
    }
}
//Testing