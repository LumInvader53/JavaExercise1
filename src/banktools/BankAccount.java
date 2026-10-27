package banktools;

import exceptions.AccountFrozenException;
import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
  public void deposit(double amount) throws AccountFrozenException, InvalidAmountException {
    try {
      if (isFrozen) {
        throw new AccountFrozenException("Account is FROZEN.\nUnable to transact.");
      }

      System.out.printf("Amount deposited: %.2f%n", amount);

      if (amount <= 0) {
        throw new InvalidAmountException("Invalid amount. Must be greater than 0");
      }

      balance += amount;
      transactionHistory.add(new Transaction("Deposit", amount));
      System.out.printf("Current balance: %.2f%n", balance);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
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
  public void withdraw(double amount) throws AccountFrozenException,
      InvalidAmountException, InsufficientFundsException {

    try {
      if (isFrozen) {
        throw new AccountFrozenException("Account is FROZEN.\nUnable to transact.");
      }

      System.out.printf("Amount withdrawn: %.2f%n", amount);

      if (amount <= 0) {
        throw new InvalidAmountException("Invalid amount. Must be greater than 0");
      }

      if (amount > balance) {
        String insufficientBalanceMessage = String.format(
            "Insufficient balance.\nCurrent balance: %.2f%n",
            balance);

        throw new InsufficientFundsException(insufficientBalanceMessage);
      } else {
        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount));
      }

      System.out.printf("Current balance: %.2f%n", balance);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Returns transaction history of account.
   *
   * @return Returns list of all transactions from account.
   */
  public List<Transaction> getTransactionHistory() {
    return transactionHistory;
  }

  /**
   * Format for printing a list of Transactions.
   *
   * @param txList List of transactions to be formatted
   * @return String of the formatted list of transactions
   */
  public static String formatTransactionHistoryList(List<Transaction> txList) {
    return txList.stream()
        .map(tx -> tx.toString())
        .collect(Collectors.joining("\n", "[Transaction ", "]"));
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
