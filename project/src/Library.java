public class Library {
    String name; //Название библиотеки
    int num_of_books; //Количество книг
    int num_of_genres; //Количество жанров
    int num_of_rows; //Количество рядов

    //Конструктор по умолчанию
    public Library() {
        name = "Unknown";
        num_of_books = 0;
        num_of_genres = 0;
        num_of_rows = 0;
    }

    //Конструктор с параметрами
    public Library(String name, int num_of_books, int num_of_genres, int num_of_rows) {
        this.name = name;
        this.num_of_books = num_of_books;
        this.num_of_genres = num_of_genres;
        this.num_of_rows = num_of_rows;
    }

    //Вывод
    void out() {
        System.out.println("Название: " + name);
        System.out.println("Количество книг: " + num_of_books);
        System.out.println("Количество жанров: " + num_of_genres);
        System.out.println("Количество рядов: " + num_of_rows);
    }
}
