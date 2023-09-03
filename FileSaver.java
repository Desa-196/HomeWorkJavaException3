import java.io.FileWriter;
import java.io.IOException;
/*
 * Класс сохранения в файл реализующий интерфейс DataSaver
 */
public class FileSaver implements DataSaver{
    public void saveData(User user) throws IOException{
        try(FileWriter fileWriter = new FileWriter(user.getSurname()+".txt", true) ){
            fileWriter.append(user+"\n");
            fileWriter.flush();
        }

    }
}
