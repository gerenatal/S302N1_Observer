import javax.security.auth.Subject;

public class NYSE extends Observer {
    public NYSE(Subject subject){
        this.stockBroker = subject;
        this.stockBroker.add(this);
    }
    @Override
    public void update(boolean stockGoesUp){
        System.out.println("NYSE notified: Stock market is " + (stockGoesUp ? "up" : "down"));
    }
}
