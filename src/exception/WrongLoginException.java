package exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String exception) {
        super(exception);
    }
}
