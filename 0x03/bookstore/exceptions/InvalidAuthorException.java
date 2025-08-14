package 0x03.bookstore.exceptions;

public class InvalidAuthorException extends Exception {
    public InvalidAuthorException(String authorMsg) {
        this.authorMsg = authorMsg;
    }
}
