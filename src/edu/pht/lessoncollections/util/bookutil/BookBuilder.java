package edu.pht.lessoncollections.util.bookutil;

import edu.pht.lessoncollections.domain.Book;

public abstract class BookBuilder {

    Book book;

    public void createBook() {
        book = new Book();
    }

    public abstract void buildTitle();
    public abstract void buildTitle(String title);
    public abstract void buildAuthorSurname();
    public abstract void buildAuthorSurname(String surname);
    public abstract void buildAuthorName();
    public abstract void buildAuthorName(String name);
    public abstract void buildAuthorAddName();
    public abstract void buildAuthorAddName(String addName);
    public abstract void buildPublicationDate();
    public abstract void buildPublicationDate(int date);

    public Book getBook() {
        return book;
    }
}
