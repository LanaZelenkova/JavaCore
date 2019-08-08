package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Book;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Book b1 = new Book("It", "King", "Stephen", 1999);
        Book b2 = new Book("War and Peace", "Tolstoy", "Leo", 1888);
        Book b3 = new Book("Alice in the Wonderland", "Carroll", "Lewis", 2000);
        List<Book> books = new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        output(books);
        books.remove(1);
        output(books);
    }
    private static void output(Collection<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
