package ExceptionTask;

public class IdExistException extends RuntimeException {
    public IdExistException(String message) {
        super(message);
    }
}
