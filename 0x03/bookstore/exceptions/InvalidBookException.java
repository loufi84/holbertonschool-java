package exceptions;

public class InvalidBookException extends Exception {
    public InvalidBookException(String bookMsg) {
        this.bookMsg = bookMsg;
    }
}
