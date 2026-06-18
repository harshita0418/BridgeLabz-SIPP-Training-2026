class InsufficientBalanceException extends Exception {
    private double balance;
    private double amount;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance. Available: ₹" + balance + ", Requested: ₹" + amount);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() { return balance; }
    public double getAmount() { return amount; }
}

public class ATM {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        System.out.println("Withdrawal successful. Remaining: ₹" + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
            System.out.println("Your balance: ₹" + e.getBalance());
            System.out.println("You requested: ₹" + e.getAmount());
        }
    }
}