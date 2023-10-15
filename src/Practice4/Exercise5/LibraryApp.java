package Practice4.Exercise5;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения", "Иванов");
        Book book2 = new Book("Словарь", "Петров");
        Book book3 = new Book("Энциклопедия", "Сидоров");

        Reader reader1 = new Reader("Иванов И.И.", 1, "ИТ", "01.01.1990", "123-456-789");
        Reader reader2 = new Reader("Петров П.П.", 2, "Физика", "15.03.1988", "987-654-321");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader2.returnBook(2);
        reader2.returnBook("Приключения", "Словарь");
        reader2.returnBook(book1, book2);
    }
}
