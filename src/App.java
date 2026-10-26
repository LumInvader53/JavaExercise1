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

    // Test Case 2
    System.out.println("\nTEST CASE 2:");
    try {
      acc1.deposit(1000.125);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 3
    System.out.println("\nTEST CASE 3:");
    try {
      acc1.deposit(0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 4
    System.out.println("\nTEST CASE 4:");
    try {
      acc1.deposit(-500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 5
    System.out.println("\nTEST CASE 5:");
    try {
      acc1.withdraw(500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 6
    System.out.println("\nTEST CASE 6:");
    try {
      acc1.withdraw(1500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 7
    System.out.println("\nTEST CASE 7:");
    try {
      acc1.withdraw(-100);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 8
    System.out.println("\nTEST CASE 8:");
    try {
      acc1.freezeAccount();
      acc1.deposit(11500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 9
    System.out.println("\nTEST CASE 9:");
    try {
      acc1.withdraw(500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Test Case 10
    System.out.println("\nTEST CASE 10:");
    try {
      acc1.unfreezeAccount();
      acc1.withdraw(100);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\n\nEXERCISE 2:\n");

    System.out.println("\nTEST CASE 1:");
    System.out.println("Transaction history:");
    System.out.println(acc1.getTransactionHistory());

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
    try {
      acc1.deposit(-500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 2:");
    try {
      acc1.freezeAccount();
      acc1.deposit(11500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 3:");
    try {
      acc1.unfreezeAccount(); //Have to call?
      acc1.withdraw(-100);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 4:");
    try {
      acc1.withdraw(1500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 5:");
    try {
      acc1.freezeAccount();
      acc1.withdraw(500);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 6:");
    try {
      System.out.println(accM1.filterTransactionsAtOrAbove(200, acc1.getTransactionHistory()));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\nTEST CASE 7:");
    try {
      System.out.println(accM1.sortTransactionsByAmount(acc1.getTransactionHistory()));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
