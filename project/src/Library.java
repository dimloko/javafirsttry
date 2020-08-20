public class Library {
    String name; //Название библиотеки
    int numberOfBooks; //Количество книг
    int numberOfGenres; //Количество жанров
    int numberOfRows; //Количество рядов

    //Конструктор по умолчанию
    public Library() {
    }

    //Конструктор с параметрами
    public Library(String name, int numberOfBooks, int numberOfGenres, int numberOfRows) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.numberOfGenres = numberOfGenres;
        this.numberOfRows = numberOfRows;
    }

    //Вывод
    void out() {
        System.out.println("Название: " + name);
        System.out.println("Количество книг: " + numberOfBooks);
        System.out.println("Количество жанров: " + numberOfGenres);
        System.out.println("Количество рядов: " + numberOfRows);
    }
}
