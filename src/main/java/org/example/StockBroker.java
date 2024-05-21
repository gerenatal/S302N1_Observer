package org.example;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Observable {
    private final List<StockMarketAgency> agencies;
    private double stockPrice;
    private boolean stockPriceGoesUp = false;

    public StockBroker() {
        this.agencies = new ArrayList<>();
    }

    @Override
    public void addObserver(StockMarketAgency agency) {
        agencies.add(agency);
    }

    @Override
    public void removeObserver(StockMarketAgency agency) {
        agencies.remove(agency);
    }

    @Override
    public void notifyObservers() {
        for (StockMarketAgency agency : agencies) {
            agency.update(stockPrice, stockPriceGoesUp);
        }
    }

    @Override
    public void setStockPrice(double stockPrice) {
        stockPriceGoesUp = stockPrice > this.stockPrice;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }
}
