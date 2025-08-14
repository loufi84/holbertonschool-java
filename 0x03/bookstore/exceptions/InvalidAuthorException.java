package exceptions;

public class InvalidAuthorException extends Exception {
    public InvalidAuthorException(String authorMsg) {
        this.authorMsg = authorMsg;
    }
}
