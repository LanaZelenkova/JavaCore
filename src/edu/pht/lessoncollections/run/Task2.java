package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Book;
import edu.pht.lessoncollections.util.bookutil.BookUtil;
import edu.pht.lessoncollections.util.bookutil.Director;
import edu.pht.lessoncollections.util.bookutil.EqualBookBuilder;

import java.util.Arrays;
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
        BookUtil.print(setOfBooks);
        System.out.println("_________________________________________________________________________________________");
        String[] arrayOfVowels = new String[] {"a", "e", "i", "o", "u"};
        BookUtil.outputIfStartsWith(setOfBooks, arrayOfVowels);
    }
}
