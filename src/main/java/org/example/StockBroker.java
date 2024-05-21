package org.example;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private final List<StockMarketAgency> agencies;
    private double stockPrice;
    private boolean stockPriceGoesUp = false;

    public StockBroker() {
        this.agencies = new ArrayList<>();
    }

    public void addObserver(StockMarketAgency agency) {
        agencies.add(agency);
    }

    public void removeObserver(StockMarketAgency agency) {
        agencies.remove(agency);
    }

    public void notifyObservers() {
        for (StockMarketAgency agency : agencies) {
            agency.update(stockPrice, stockPriceGoesUp);
        }
    }

    public void setStockPrice(double stockPrice) {
        stockPriceGoesUp = stockPrice > this.stockPrice;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }
}
