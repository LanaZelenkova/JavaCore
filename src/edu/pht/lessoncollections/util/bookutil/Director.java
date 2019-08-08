package edu.pht.lessoncollections.util.bookutil;

import edu.pht.lessoncollections.domain.Book;

public class Director {

    BookBuilder builder;

    public void setBuilder(BookBuilder builder) {
        this.builder = builder;
    }

    public Book buildBook() {
        builder.createBook();
        builder.buildTitle();
        builder.buildAuthorSurname();
        builder.buildAuthorName();
        builder.buildAuthorAddName();
        builder.buildPublicationDate();
        Book book = builder.getBook();
        return book;
    }

    public Book buildBook(String title, String surname, String name, String addName, int date) {
        builder.createBook();
        builder.buildTitle(title);
        builder.buildAuthorSurname(surname);
        builder.buildAuthorName(name);
        builder.buildAuthorAddName(addName);
        builder.buildPublicationDate(date);
        Book book = builder.getBook();
        return book;
    }
}
