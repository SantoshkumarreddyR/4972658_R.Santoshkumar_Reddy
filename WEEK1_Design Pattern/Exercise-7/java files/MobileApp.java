public class MobileApp implements Observer {
    private String stockPrice;

    @Override
    public void update(String stockPrice) {
        this.stockPrice = stockPrice;
        display();
    }

    public void display() {
        System.out.println("Mobile App: Stock Price updated to " + stockPrice);
    }
}
