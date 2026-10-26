package banktools;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BankAccountManager.
 */
public class BankAccountManager implements Bank {
  private Map<Integer, BankAccount> accounts;
  private int id;

  public BankAccountManager() {
    accounts = new HashMap<Integer, BankAccount>();
    id = 0;
  }

  @Override
  public void addAccount(BankAccount account) {
    accounts.put(id, account);
    System.out.println("Account successfully added with ID: " + id);
    id++;
  }

  @Override
  public BankAccount getAccount(int id) {
    return accounts.get(id);
  }

  /**
   * Prints all accounts in accounts.
   * Checks if account is a SavingsAccount before printing ownerName.
   */
  public void listAccounts() {
    for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
      int accountId = entry.getKey();
      BankAccount account = entry.getValue();
      String accountName = "NULL";
      if (account instanceof SavingsAccount) {
        accountName = ((SavingsAccount) account).getOwnerName();
      }
      String balance = String.format("%.2f", account.getBalance());

      System.out.println("Account ID: " + accountId
          + ", Account Name: " + accountName
          + ", Balance: " + balance);
    }
  }

  public List<Transaction> filterTransactionsAtOrAbove(double amount, List<Transaction> txList) {
    System.out.println("Filtering transactions at or above 200...");
    return txList.stream()
        .filter(a -> a.getAmount() >= 500)
        .toList();
  }

  public List<Transaction> sortTransactionsByAmount(List<Transaction> txList) {
    System.out.println("Sorting transactions by amount...");
    return txList.stream()
        .sorted(Comparator.comparingDouble(Transaction::getAmount))
        .toList();
  }
}
