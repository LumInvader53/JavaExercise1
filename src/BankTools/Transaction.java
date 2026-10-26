package banktools;

import java.time.LocalDateTime;

/**
 * Transaction.
 */
public class Transaction {
  private String type;
  private double amount;
  private LocalDateTime timeStamp;

  /**
   * Initializes Transaction.
   * Types can be Deposit or Withdraw.
   * Amount is amount withdrawn or deposited based on type.
   * time_stamp is set to current time now.
   *
   * @param type   String
   * @param amount double
   */
  public Transaction(String type, double amount) {
    this.type = type;
    this.amount = amount;
    timeStamp = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "type=" + type + ", amount=" + amount + ", time_stamp=" + timeStamp;
  }

}
