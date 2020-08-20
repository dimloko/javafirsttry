public class ClassRunner {
    public static void main(String[] args) {
        Book book1=new Book("Шерлок холмс","Дойл",100,1987);
        book1.out();
        Autor autor1 = new Autor("Артур", "Дойл", 1912);
        autor1.out();

        Genre genre1 = new Genre("Фантастика", 35, 7);
        genre1.out();

        Library lib1 = new Library("Домашняя", 3,10,2);
        lib1.out();
    }
}
