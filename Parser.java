import java.text.ParseException;
import java.util.ArrayList;

public class Parser {
    public User parseText(String text) throws ParseException{
        String[] array = text.split(" ");
        if(array.length != 6) throw new ParserException("Некорректное количество данных!", null);
        long telephone = Long.parseLong(array[4]);
        if(array[5].toCharArray().length > 1) throw new ParserException("Поле \"Пол\" содержит более одного символа!", null);
        return new User(array[0], array[1], array[2], array[3], telephone, array[5].toCharArray()[0]);
    }
}
