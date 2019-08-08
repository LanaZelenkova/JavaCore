package edu.pht.lessoncollections.util.bookutil;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomBookBuilder extends BookBuilder {

    public static final int MIN_LENGHT = 1;
    public static final int MAX_LENGHT = 3;
    public static final int MIN_YEAR = 1888;
    public static final int MAX_YEAR = 2019;

    @Override
    public void buildTitle() {
        book.setTitle(randomString());
    }

    public void buildTitle(String title) {
        book.setTitle(title);
    }

    @Override
    public void buildAuthorSurname() {
        book.setAuthorSurname(randomString());
    }

    public void buildAuthorSurname(String surname) {
        book.setAuthorSurname(surname);
    }

    @Override
    public void buildAuthorName() {
        book.setAuthorName(randomString());
    }

    public void buildAuthorName(String name) {
        book.setAuthorName(name);
    }

    @Override
    public void buildAuthorAddName() {
        book.setAuthorAddName(randomString());
    }

    public void buildAuthorAddName(String addName) {
        book.setAuthorAddName(addName);
    }

    @Override
    public void buildPublicationDate() {
        book.setPublicationDate(randomInt());
    }

    public void buildPublicationDate(int date) {
        book.setPublicationDate(date);
    }

    private static String randomString() {
        return RandomStringUtils.randomAlphabetic(MIN_LENGHT, MAX_LENGHT);
    }

    private static int randomInt() {
        return RandomUtils.nextInt(MIN_YEAR, MAX_YEAR);
    }
}
