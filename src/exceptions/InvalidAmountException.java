package exceptions;

public class InvalidAmountException extends Exception {
    public String message;

    public InvalidAmountException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
