public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private int telephone;
    private char gender;

    User(String surname, String name, String patronymic, String dateOfBirth, int telephone,char gender){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
        this.gender = gender;
    }

}
