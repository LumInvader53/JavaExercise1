package exceptions;

/**
 * InsufficientFundsException.
 * Exception for when a withdrawal exceeds the available balance.
 *
 */
public class InsufficientFundsException extends Exception {
  private String message;

  public InsufficientFundsException(String message) {
    super(message);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
