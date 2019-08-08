package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Book;
import edu.pht.lessoncollections.util.bookutil.BookUtil;
import edu.pht.lessoncollections.util.bookutil.Director;
import edu.pht.lessoncollections.util.bookutil.EqualBookBuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static final int COUNT = 6;
    public static final int GENERAL_COUNT = 25;
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EqualBookBuilder());
        Set<Book> setOfBooks = new HashSet<>(Arrays.asList(BookUtil.generate(GENERAL_COUNT - COUNT)));
        for (int i = 0; i < COUNT; i++) {
            setOfBooks.add(director.buildBook());
        }
        outputAll(setOfBooks);
        System.out.println("_________________________________________________________________________________________");
        output(setOfBooks);
    }

    private static void outputAll(Collection<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void output(Collection<Book> books) {
        for (Book book : books) {
            if (isCondition(book)) {
                System.out.println(book);
            }
        }
    }
    private static boolean isCondition(Book book) {
        return toLowerCase(book).startsWith("a") || toLowerCase(book).startsWith("e") || toLowerCase(book).startsWith("i") ||
                toLowerCase(book).startsWith("o") || toLowerCase(book).startsWith("u");
    }
    private static String toLowerCase(Book book) {
        return book.getTitle().trim().toLowerCase();
    }
}
