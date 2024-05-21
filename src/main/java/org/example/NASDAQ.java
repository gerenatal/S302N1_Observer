package org.example;

public class NASDAQ implements StockMarketAgency {
    private final String name;

    public NASDAQ() {
        name = "NASDAQ";
    }

    @Override
    public void update(double stockPrice, boolean stockPriceGoesUp) {
        System.out.println("NASDAQ - " + name + ": Stock price updated to " + stockPrice);
        System.out.println(stockPriceGoesUp ? "Stock price goes up" : "Stock price goes down");
    }
}
