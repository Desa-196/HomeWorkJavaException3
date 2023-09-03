/*
 * Интерфейс для сохранения данных пользователя
 */
import java.io.IOException;

public interface DataSaver {
    public void saveData(User user) throws IOException;
}
