package BankTools;
import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount.
 */
public class BankAccount {
  private double balance;
  private boolean isFrozen;

  List<Transaction> transactionHistory;

  public BankAccount() {
    balance = 0;
    isFrozen = false;
    transactionHistory = new ArrayList<Transaction>();
  }

  private enum Operation {
    DEPOSIT,
    WITHDRAW
  }

  public void deposit(double amount) {
    helperFunction(Operation.DEPOSIT, amount);
  }

  public void withdraw(double amount) {
    helperFunction(Operation.WITHDRAW, amount);
  }

  private void helperFunction(Operation operation, double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN.\nUnable to transact.");
      return;
    }

    if (operation == Operation.DEPOSIT) {
      System.out.printf("Amount deposited: %.2f%n", amount);
    }

    if (operation == Operation.WITHDRAW) {
      System.out.printf("Amount withdrawn: %.2f%n", amount);
    }

    if (amount <= 0) {
      System.out.println("Invalid amount. Must be greater than 0");
    } else {

      if (operation == Operation.DEPOSIT) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
      }

      if (operation == Operation.WITHDRAW) {
        if (amount > balance) {
          System.out.println("Insufficient balance.");
        } else {
          balance -= amount;
          transactionHistory.add(new Transaction("Withdraw", amount));
        }
      }

      System.out.printf("Current balance: %.2f%n", balance);
    }
  }

  public List<Transaction> geTransactionHistory(){
    System.out.println("Transaction History:");
    System.out.print("[Transaction ");
    for(Transaction transaction : transactionHistory){
      System.out.print("[" + transaction + "] ");
    }
    System.out.println("]");
    return transactionHistory;
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
