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
        if (dateOfBirth.matches("^(\\d{2}).(\\d{2}).(\\d{4})$")) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new UserException("Некорректная дата!", null);
        }
        this.telephone = telephone;
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            throw new UserException("Некорректный пол!", null);
        }
    }

}
