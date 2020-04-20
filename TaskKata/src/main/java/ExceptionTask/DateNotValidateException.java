package ExceptionTask;

public class DateNotValidateException extends RuntimeException{
    public DateNotValidateException(String message){
        super(message);
    }
}
