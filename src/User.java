public class User {

    private String name, username, password;
    private double balance;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public String getUsername () {
        return username;
    }

    public String getName () {
        return name;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public boolean withdraw (double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance\nRemaining Balance: "+balance);
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
