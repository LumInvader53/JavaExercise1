package banktools;

import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount.
 */
public class BankAccount {
  private double balance;
  private boolean isFrozen;

  List<Transaction> transactionHistory;

  /**
   * Initializes BankAccount.
   * balance is set as 0.
   * isFrozen is set to false.
   * transactionHistory is initialized
   */
  public BankAccount() {
    balance = 0;
    isFrozen = false;
    transactionHistory = new ArrayList<Transaction>();
  }

  /**
   * Handles deposit transactions.
   * Checks if account is frozen before transaction.
   * Checks if amount to be deposited is greater than 0.
   * Adds amount to balance.
   * Adds a Deposit transaction to Transaction History.
   *
   * @param amount Amount to be deposited
   */
  public void deposit(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN.\nUnable to transact.");
      return;
    }

    System.out.printf("Amount deposited: %.2f%n", amount);

    if (amount <= 0) {
      System.out.println("Invalid amount. Must be greater than 0");
      return;
    }

    balance += amount;
    transactionHistory.add(new Transaction("Deposit", amount));
    System.out.printf("Current balance: %.2f%n", balance);

  }

  /**
   * Handles deposit transactions.
   * Checks if account is frozen before transaction.
   * Checks if amount to be withdrawn is lesser than balance.
   * Subtracts amount to balance.
   * Adds a Withdraw transaction to Transaction History.
   *
   * @param amount Amount to be withdrawn
   */
  public void withdraw(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN.\nUnable to transact.");
      return;
    }

    System.out.printf("Amount withdrawn: %.2f%n", amount);

    if (amount <= 0) {
      System.out.println("Invalid amount. Must be greater than 0");
      return;
    }

    if (amount > balance) {
      System.out.println("Insufficient balance.");
    } else {
      balance -= amount;
      transactionHistory.add(new Transaction("Withdraw", amount));
    }

    System.out.printf("Current balance: %.2f%n", balance);
  }

  /**
   * Returns transaction history of account.
   * Prints each transaction.
   *
   * @return Returns list of all transactions from account.
   */
  public List<Transaction> geTransactionHistory() {
    System.out.println("Transaction History:");
    System.out.print("[Transaction ");
    for (Transaction transaction : transactionHistory) {
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
