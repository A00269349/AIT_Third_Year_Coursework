/**
 * @author Raphael Salaja
 * @version 13/10/21
 */
public class Account {
    private double balance;

    public Account() {
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }

    public void addAmount(double amount) {
        double tmp = balance;
        setBalance(tmp + amount);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void subtractAmount(double amount) {
        double tmp = balance;
        setBalance(tmp - amount);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
