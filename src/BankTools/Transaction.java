package banktools;

import java.time.LocalDateTime;

/**
 * Transaction.
 */
public class Transaction {
  private String type;
  private double amount;
  private LocalDateTime time_stamp;

  /**
   * Constructor for Transaction.
   *
   * @param type   String
   * @param amount double
   */
  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
    time_stamp = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "type=" + type + ", amount=" + amount + ", time_stamp=" + time_stamp;
  }

}
