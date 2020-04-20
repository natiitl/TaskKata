package ExceptionTask;

public class IdRequiredException extends RuntimeException {
    public IdRequiredException(String message){
        super(message);
    }
}
