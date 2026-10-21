enum Operation {
    DEPOSIT,
    WITHDRAW
}

public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        balance = 0;
        isFrozen = false;
    }

    private void helperFunction(Operation operation, double amount) {
        // 1 - deposit
        // 2 - withdraw

        if (isFrozen) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
        } else {
            if (operation == Operation.DEPOSIT) {
                System.out.printf("Amount deposited: %n%.2f%n", Math.ceil(amount * 100.0) / 100.0);
                if (amount <= 0) {
                    System.out.println("Invalid amount. Must be greater than 0");
                } else {
                    balance += amount;
                    System.out.printf("Current balance: %n%.2f%n", Math.ceil(amount * 100.0) / 100.0);
                }
            }

            if (operation == Operation.WITHDRAW) {
                System.out.printf("Amount withdrawn: %n%.2f%n", Math.ceil(amount * 100.0) / 100.0);
                if (amount > balance) {
                    System.out.println("Insufficient balance.");
                    System.out.printf("Current balance: %n%.2f%n", Math.ceil(amount * 100.0) / 100.0);
                } else if (amount <= 0) {
                    System.out.println("Invalid amount. Must be greater than 0");
                } else {
                    balance -= amount;
                    System.out.printf("Current balance: %n%.2f%n", Math.ceil(amount * 100.0) / 100.0);
                }
            }
        }

    }

    public void deposit(double amount) {
        helperFunction(Operation.DEPOSIT, amount);
    }

    public void withdraw(double amount) {
        helperFunction(Operation.WITHDRAW, amount);
    }

    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

    public void unfreezeAccount() {
        isFrozen = false;
    }
}
