enum Operation {
    DEPOSIT,
    WITHDRAW
}

/**
 * BankAccount
 */
public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        balance = 0;
        isFrozen = false;
    }

    /**
     * 
     * @param amount
     */
    public void deposit(double amount) {
        helperFunction(Operation.DEPOSIT, amount);
    }

    /**
     * 
     * @param amount
     */
    public void withdraw(double amount) {
        helperFunction(Operation.WITHDRAW, amount);
    }

    private void helperFunction(Operation operation, double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
            return;
        }

        if (operation == Operation.DEPOSIT)
            System.out.printf("Amount deposited: %.2f%n", amount);
        
        if (operation == Operation.WITHDRAW) 
            System.out.printf("Amount withdrawn: %.2f%n", amount);
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0");
        } else {

            if (operation == Operation.DEPOSIT) {
                balance += amount;
            }

            if (operation == Operation.WITHDRAW) {
                if (amount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= amount;
                }
            }

            System.out.printf("Current balance: %.2f%n", balance);
        }
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
