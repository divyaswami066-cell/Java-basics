
class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setBalance(double amount) {
        if (amount < 0) {
            System.out.println("Invalid balance");
        } else {
            balance = amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Divya");
        b.setBalance(1000);

        b.setBalance(-500);
        b.withdraw(1500);
        b.deposit(500);

        b.display();
    }
}
