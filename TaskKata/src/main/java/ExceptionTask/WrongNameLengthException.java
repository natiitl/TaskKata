package ExceptionTask;

public class WrongNameLengthException extends RuntimeException {
    public WrongNameLengthException(String message){
        super(message);
    }
}
