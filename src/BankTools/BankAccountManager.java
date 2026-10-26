package banktools;

import java.util.HashMap;
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
  public BankAccount geAccount(int id) {
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
}
