public class Book {
    String title;
    String autor; //Автор
    int num_of_page; //Количество страниц
    int year; //Год издания

    //Конструктор по умлочанию
    public Book() {
        title = "Unknown";
        autor = "Unknown";
        num_of_page = 0;
        year = 0;
    }

    //Конструктор с параметрами
    public Book(String title, String autor, int numofpage, int year) {
        this.title = title;
        this.autor = autor;
        this.num_of_page = numofpage;
        this.year = year;
    }

    //Вывод
    void out() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + autor);
        System.out.println("Количество страниц: " + num_of_page);
        System.out.println("Год издания: " + year);
    }
}
