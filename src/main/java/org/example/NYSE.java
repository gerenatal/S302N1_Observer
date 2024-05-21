package org.example;

public class NYSE implements StockMarketAgency {
    private final String name;

    public NYSE() {
        name = "NYSE";
    }

    @Override
    public void update(double stockPrice, boolean stockPriceGoesUp) {
        System.out.println("NYSE - " + name + ": Stock price updated to " + stockPrice);
        System.out.println(stockPriceGoesUp ? "Stock price goes up" : "Stock price goes down");
    }
}
