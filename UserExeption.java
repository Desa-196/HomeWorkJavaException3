public class UserExeption extends RuntimeException{
    UserExeption(String message, RuntimeException e){
        super(message, e);
    }
    
}
