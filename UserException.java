public class UserException extends RuntimeException{
    UserException(String message, RuntimeException e){
        super(message, e);
    }
    
}
