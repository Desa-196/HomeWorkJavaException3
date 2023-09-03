public class ParserException extends RuntimeException{
    ParserException(String message, RuntimeException e){
        super(message, e);
    }
    
}
