import java.io.IOException;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private long telephone;
    private char gender;

    User(String surname, String name, String patronymic, String dateOfBirth, long telephone, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

        if (!dateOfBirth.matches("^(\\d{2}).(\\d{2}).(\\d{4})$"))
            throw new UserException("Некорректная дата!", null);
        this.dateOfBirth = dateOfBirth;

        this.telephone = telephone;

        if (gender != 'f' && gender != 'm')
            throw new UserException("Некорректный пол!", null);
        this.gender = gender;

    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getTelephone() {
        return telephone;
    }

    public char getGender() {
        return gender;
    }
    /*
     * Метод для сохранения данных, для сохранения используем объект реализующий интерфейс DataSaver, благодаря чему в дальнейшем 
     * можем легко изменить способ хранения данных
     */
    public void save(DataSaver dataSaver) throws IOException{
        dataSaver.saveData(this);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s", surname, name, patronymic, dateOfBirth, telephone, gender);
    }


}
