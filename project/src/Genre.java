public class Genre {
    String genre_name; //Название жанра
    int number_of_books; //Количество книг данного жанра
    int row; //Ряд в библиотеке

    //Конструктор по умолчанию

    public Genre() {
        genre_name = "Unknown";
        number_of_books = 0;
        row = 0;
    }

    public Genre(String genre_name, int number_of_books, int row) {
        this.genre_name = genre_name;
        this.number_of_books = number_of_books;
        this.row = row;
    }

    //Вывод
    void out() {
        System.out.println("Название жанра: " + genre_name);
        System.out.println("Количество книг: " + number_of_books);
        System.out.println("Ряд в библиотеке: " + row);
    }
}
