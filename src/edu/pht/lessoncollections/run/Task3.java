package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Book;
import edu.pht.lessoncollections.util.bookutil.BookUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Task3 {
    public static void main(String[] args) {
        /*Book b1 = new Book("It", "King", "Stephen", 1999);
        Book b2 = new Book("War and Peace", "Tolstoy", "Leo", 1888);
        Book b3 = new Book("Alice in the Wonderland", "Carroll", "Rewis", 2000);
        Book b4 = new Book("Alice in the Wonderland", "Carroll", "Lewis", "SArturovich", 2000);
        Book b5 = new Book("Alice in the Wonderland", "Carroll", "Lewis", "Samsonovich", 2000);
        Book b6 = new Book("Alice in the Wonderland", "Carroll", "Aewis", 2000);
        Book b7 = new Book("Alice in the Wonderland", "Carroll", "Lewis", 2000);
        Book b8 = new Book("Alice in the Wonderland", "Carroll", "Wewis", 2000);
        Book b9 = new Book("The Adventures of Tom Sawyer", "Twain", "Mark", 2022);
        Book b10 = new Book("Another Country", "Baldwin", "James", 2024);
        Book b11 = new Book("One Hundred Years of Solitude", "Márquez", "Gabriel García", 2026);
        Book b12 = new Book("The Picture of Dorian Gray", "Wilde", "Oscar", 2028);
        Book[] books = new Book[] {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b12, b12, b10, b10, b10, b1,
                new Book("A", "Austen", "Jane", 2030),
                new Book("B", "Austen", "Mane", 2030),
                new Book("W", "Austen", "Kune", 2030),
                new Book("I", "Austen", "Kene", 2040),
                new Book("J", "Austen", "QQne", 2050),
                new Book("T", "Austen", "Were", 2060),
                new Book("R", "Austen", "Xyzne", 2030),
                new Book ("A", "AAAWWW", 2222),
                new Book ("W", "aaawww", 2222),
                new Book ("S", "aaaSSS", 2222)};*/

        List<Book> listOfBooks = new LinkedList<>(Arrays.asList(BookUtil.generate(Task2.GENERAL_COUNT)));
        BookUtil.print(listOfBooks);
        System.out.println("_________________________________________________________________________________________");
        Book[] books = new Book[listOfBooks.size()];
        BookUtil.sort(listOfBooks.toArray(books));
        BookUtil.print(Arrays.asList(books));
        System.out.println("_________________________________________________________________________________________");
        Collections.shuffle(listOfBooks);
        Collections.sort(listOfBooks);
        BookUtil.print(listOfBooks);
    }
}
