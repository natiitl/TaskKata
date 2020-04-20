package ExceptionTask;

public class CharactersNotValidException extends RuntimeException {
    public CharactersNotValidException(String message){
        super(message);
    }
}
