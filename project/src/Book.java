public class Book {
    String title;
    String autor; //Автор
    int numberOfPage; //Количество страниц
    int year; //Год издания

    //Конструктор по умлочанию
    public Book() {
    }

    //Конструктор с параметрами
    public Book(String title, String autor, int numberOfPage, int year) {
        this.title = title;
        this.autor = autor;
        this.numberOfPage = numberOfPage;
        this.year = year;
    }

    //Вывод
    void out() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + autor);
        System.out.println("Количество страниц: " + numberOfPage);
        System.out.println("Год издания: " + year);
    }
}
