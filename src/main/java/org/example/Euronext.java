package org.example;

public class Euronext implements StockMarketAgency {
    private final String name;

    public Euronext() {
        name = "Euronext";
    }

    @Override
    public void update(double stockPrice, boolean stockPriceGoesUp) {
        System.out.println("Euronext - " + name + ": Stock price updated to " + stockPrice);
        System.out.println(stockPriceGoesUp ? "Stock price goes up" : "Stock price goes down");
    }
}
