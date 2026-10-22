package BankTools;
import java.time.LocalDateTime;

public class Transaction {
  private String type;
  private double amount;
  private LocalDateTime time_stamp;

  public Transaction(String type, double amount){
    this.type = type;
    this.amount = amount;
    time_stamp = LocalDateTime.now();
  }

  @Override
  public String toString(){
    return "type=" + type + ", amount=" + amount + ", time_stamp=" + time_stamp;
  }

}
