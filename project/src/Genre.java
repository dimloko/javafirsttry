public class Genre {
    String name; //Название жанра
    int numberOfBooks; //Количество книг данного жанра
    int row; //Ряд в библиотеке

    //Конструктор по умолчанию
    public Genre() {
    }

    public Genre(String name, int numberOfBooks, int row) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.row = row;
    }

    //Вывод
    void out() {
        System.out.println("Название жанра: " + name);
        System.out.println("Количество книг: " + numberOfBooks);
        System.out.println("Ряд в библиотеке: " + row);
    }
}
