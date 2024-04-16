import javax.security.auth.Subject;

class Euronext extends Observer {
    public Euronext(StockBroker subject) {
        this.stockBroker = subject;
        this.stockBroker.add(this);
    }

    @Override
    public void update() {
        // Implementation
    }
}
