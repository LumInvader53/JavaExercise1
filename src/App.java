import banktools.BankAccount;
import banktools.BankAccountManager;
import banktools.SavingsAccount;

/**
 * Exercise1.
 */
public class App {
  /**
   * Main Program.
   *
   * @param args Default for main
   * @throws Exception Default for main
   */
  public static void main(String[] args) throws Exception {
    System.out.println("EXERCISE 1:\n");

    // Test Case 1
    System.out.println("\nTEST CASE 1:");
    BankAccount acc1 = new SavingsAccount("Test0");
    System.out.println("Account Owner: " + ((SavingsAccount)acc1).getOwnerName() + ".");

    // Test Case 2
    System.out.println("\nTEST CASE 2:");
    acc1.deposit(1000.125);

    // Test Case 3
    System.out.println("\nTEST CASE 3:");
    acc1.deposit(0);

    // Test Case 4
    System.out.println("\nTEST CASE 4:");
    acc1.deposit(-500);

    // Test Case 5
    System.out.println("\nTEST CASE 5:");
    acc1.withdraw(500);

    // Test Case 6
    System.out.println("\nTEST CASE 6:");
    acc1.withdraw(1500);

    // Test Case 7
    System.out.println("\nTEST CASE 7:");
    acc1.withdraw(-100);

    // Test Case 8
    System.out.println("\nTEST CASE 8:");
    acc1.freezeAccount();
    acc1.deposit(11500);

    // Test Case 9
    System.out.println("\nTEST CASE 9:");
    acc1.withdraw(500);

    // Test Case 10
    System.out.println("\nTEST CASE 10:");
    acc1.unfreezeAccount();
    acc1.withdraw(100);

    System.out.println("\n\nEXERCISE 2:\n");

    System.out.println("\nTEST CASE 1:");
    System.out.println("Transaction history:");
    System.out.println(BankAccount.formatTransactionHistoryList(acc1.getTransactionHistory()));

    System.out.println("\nTEST CASE 2:");
    BankAccountManager accM1 = new BankAccountManager();

    System.out.println("\nTEST CASE 3:");
    accM1.addAccount(acc1);

    System.out.println("\nTEST CASE 4:");
    accM1.addAccount(new SavingsAccount("Test1"));

    System.out.println("\nTEST CASE 5:");
    accM1.listAccounts();

    System.out.println("\n\nEXERCISE 3:\n");

    System.out.println("\nTEST CASE 1:");
    acc1.deposit(-500);

    System.out.println("\nTEST CASE 2:");
    acc1.freezeAccount();
    acc1.deposit(11500);

    System.out.println("\nTEST CASE 3:");
    acc1.unfreezeAccount();
    acc1.withdraw(-100);

    System.out.println("\nTEST CASE 4:");
    acc1.withdraw(1500);

    System.out.println("\nTEST CASE 5:");
    acc1.freezeAccount();
    acc1.withdraw(500);

    System.out.println("\nTEST CASE 6:");
    System.out.println(
        BankAccount.formatTransactionHistoryList(
            accM1.filterTransactionsAtOrAbove(200, acc1.getTransactionHistory())));

    System.out.println("\nTEST CASE 7:");

    System.out.println(
        BankAccount.formatTransactionHistoryList(
            accM1.sortTransactionsByAmount(acc1.getTransactionHistory())));
  }
}
