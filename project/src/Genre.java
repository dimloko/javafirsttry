public class Genre {
    String genre_name; //Название жанра
    int numberOfBooks; //Количество книг данного жанра
    int row; //Ряд в библиотеке

    //Конструктор по умолчанию
    public Genre() {
    }

    public Genre(String genre_name, int numberOfBooks, int row) {
        this.genre_name = genre_name;
        this.numberOfBooks = numberOfBooks;
        this.row = row;
    }

    //Вывод
    void out() {
        System.out.println("Название жанра: " + genre_name);
        System.out.println("Количество книг: " + numberOfBooks);
        System.out.println("Ряд в библиотеке: " + row);
    }
}
