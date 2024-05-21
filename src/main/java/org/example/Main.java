package org.example;

public class Main {
    public static void main(String[] args) {
        StockBroker stockBroker = new StockBroker();

        StockMarketAgency euronext = new Euronext();
        StockMarketAgency nasdaq = new NASDAQ();
        StockMarketAgency nyse = new NYSE();

        stockBroker.addObserver(euronext);
        stockBroker.addObserver(nasdaq);
        stockBroker.addObserver(nyse);

        System.out.println("Setting stock price to 50.0");
        stockBroker.setStockPrice(50);

        System.out.println("Setting stock price to 75.5");
        stockBroker.setStockPrice(75.5);

        System.out.println("Removing Euronext");
        stockBroker.removeObserver(euronext);

        System.out.println("Setting stock price to 20");
        stockBroker.setStockPrice(20);
    }
}