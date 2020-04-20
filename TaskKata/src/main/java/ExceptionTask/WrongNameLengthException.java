package ExceptionTask;

public class WrongNameLengthException extends RuntimeException {
    WrongNameLengthException(String message){
        super(message);
    }
}
