package banktools;
/**
 * SavingsAccount.
 */
public class SavingsAccount extends BankAccount {
  private String ownerName;

  /**
   * Constructor for SavingsAccount.
   * Must have owner name.
   *
   * @param ownerName Name of the owner
   */
  public SavingsAccount(String ownerName) {
    super();
    this.ownerName = ownerName;
    System.out.println("Account Owner: " + ownerName + ".");
  }

  public String getOwnerName() {
    return ownerName;
  }
}
