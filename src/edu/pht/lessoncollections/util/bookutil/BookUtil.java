package edu.pht.lessoncollections.util.bookutil;

import edu.pht.lessoncollections.domain.Book;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

public class BookUtil {
    public static int min = 1;
    public static int max = 3;
    public static int yearMin = 1888;
    public static int yearMax = 2019;
    public static Book[] generate(int count) {
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
            Book book = new Book();
            book.setTitle(randomString());
            book.setAuthorSurname(randomString());
            book.setAuthorName(randomString());
            book.setAuthorAddName(randomString());
            book.setPublicationDate(randomInt());
            result[i] = book;
        }
        return result;
    }
    private static String randomString() {
        return StringUtils.capitalize(RandomStringUtils.randomAlphabetic(min, max).toLowerCase());
    }

    private static int randomInt() {
        return RandomUtils.nextInt(yearMin, yearMax);
    }

    public static void print(Collection<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void sort(Book[] books) {
        int n = books.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (books[j - 1].compareTo(books[j]) > 0) {
                    Book temp = books[j - 1];
                    books[j - 1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}
