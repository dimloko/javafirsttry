public class Autor {
    String name; //Имя
    String surname; //Фамилия
    int dob; //Дата рождения

    //Конструктор по умолчанию
    public Autor() {
        name = "Unknown";
        surname = "Unknown";
        dob = 0;
    }

    //Конструктор с параметрами
    public Autor(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    //Вывод
    void out() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Год рождения: " + dob);
    }
}

