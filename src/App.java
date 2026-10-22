import BankTools.BankAccount;
import BankTools.BankAccountManager;
import BankTools.SavingsAccount;

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
    System.out.println("EXERCISE 1:\n\n");

    // Test Case 1
    System.out.println("\nTEST CASE 1:");
    BankAccount acc1 = new SavingsAccount("Test0");

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

    System.out.println("EXERCISE 2:\n\n");

    System.out.println("\nTEST CASE 1:");
    acc1.geTransactionHistory();

    System.out.println("\nTEST CASE 2:");
    BankAccountManager accM1 = new BankAccountManager();

    System.out.println("\nTEST CASE 3:");
    accM1.addAccount(acc1);

    System.out.println("\nTEST CASE 4:");
    accM1.addAccount(new SavingsAccount("Test1"));

    System.out.println("\nTEST CASE 5:");
    accM1.listAccounts();
  }
}
