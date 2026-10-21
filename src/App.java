public class App {
    public static void main(String[] args) throws Exception {
        // Test Case 1
        System.out.println("\nTEST CASE 1:\n");
        BankAccount acc1 = new SavingsAccount("Test0");

        // Test Case 2
        System.out.println("\nTEST CASE 2:\n");
        acc1.deposit(1000.125);

        // Test Case 3
        System.out.println("\nTEST CASE 3:\n");
        acc1.deposit(0);

        // Test Case 4
        System.out.println("\nTEST CASE 4:\n");
        acc1.deposit(-500);

        // Test Case 5
        System.out.println("\nTEST CASE 5:\n");
        acc1.withdraw(500);

        // Test Case 6
        System.out.println("\nTEST CASE 6:\n");
        acc1.withdraw(1500);

        // Test Case 7
        System.out.println("\nTEST CASE 7:\n");
        acc1.withdraw(-100);

        // Test Case 8
        System.out.println("\nTEST CASE 8:\n");
        acc1.freezeAccount();
        acc1.deposit(11500);

        // Test Case 9
        System.out.println("\nTEST CASE 9:\n");
        acc1.withdraw(500);

        // Test Case 10
        System.out.println("\nTEST CASE 10:\n");
        acc1.unfreezeAccount();
        acc1.withdraw(100);
    }
}
