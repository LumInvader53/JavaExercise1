package exceptions;

public class AccountFrozenException extends Exception {
    public String message;

    public AccountFrozenException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
