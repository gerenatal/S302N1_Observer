import javax.security.auth.Subject;

public class NASDAQ extends Observer {
    public NASDAQ(Subject subject){
        this.stockBroker = subject;
        this.stockBroker.add(this);
    }
    @Override
    public void update(boolean stockGoesUp){
        System.out.println("NASDAQ notified: Stock market is " + (stockGoesUp ? "up" : "down"));
    }
}
