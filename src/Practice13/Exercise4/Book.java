package Practice13.Exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book other) {
        // Сортировка по названию книги (в алфавитном порядке)
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));

        System.out.println("Original list of books:");
        printBooks(books);

        // Сортировка по названию книги
        Collections.sort(books);
        System.out.println("\nSorted by title:");
        printBooks(books);

        // Сортировка по автору с использованием компаратора
        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
        Collections.sort(books, authorComparator);
        System.out.println("\nSorted by author:");
        printBooks(books);

        // Сортировка по году выпуска с использованием компаратора
        Comparator<Book> yearComparator = Comparator.comparingInt(Book::getYear);
        Collections.sort(books, yearComparator);
        System.out.println("\nSorted by year:");
        printBooks(books);
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}


