import java.text.ParseException;

public class Parser {
    public User parseText(String text){
        if(text == null) throw new ParserException("Строка не может быть null!", null);
        String[] array = text.split(" ");
        if(array.length != 6) throw new ParserException("Некорректное количество данных!", null);
        long telephone;
        try{
            telephone = Long.parseLong(array[4]);
        }
        catch(NumberFormatException e){
            throw new ParserException("Некорректный номер телефона! "+array[4], null);
        }
        if(array[5].toCharArray().length > 1) throw new ParserException("Поле \"Пол\" содержит более одного символа!", null);
        return new User(array[0], array[1], array[2], array[3], telephone, array[5].toCharArray()[0]);
    }
}
