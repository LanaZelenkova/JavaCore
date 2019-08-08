package edu.pht.lessoncollections.util.bookutil;

public class EqualBookBuilder extends BookBuilder {

    @Override
    public void buildTitle() {
        book.setTitle("SomeTitle");
    }

    public void buildTitle(String title) {
        book.setTitle(title);
    }

    @Override
    public void buildAuthorSurname() {
        book.setAuthorSurname("SomeSurname");
    }

    public void buildAuthorSurname(String surname) {
        book.setAuthorSurname(surname);
    }

    @Override
    public void buildAuthorName() {
        book.setAuthorName("SomeName");
    }

    public void buildAuthorName(String name) {
        book.setAuthorName(name);
    }

    @Override
    public void buildAuthorAddName() {
        book.setAuthorAddName("SomeAddName");
    }

    public void buildAuthorAddName(String addName) {
        book.setAuthorAddName(addName);
    }

    @Override
    public void buildPublicationDate() {
        book.setPublicationDate(2000);
    }

    public void buildPublicationDate(int date) {
        book.setPublicationDate(date);
    }
}
