package edu.pht.lessoncollections.domain;

import java.util.Objects;

public class Book implements Comparable<Book> {

    public static final String QUOTE_LEFT = "\"";
    public static final String QUOTE_RIGHT = "\", ";
    public static final String SPACE = " ";
    public static final String COMMA = ", ";

    private String title;
    private String authorSurname;
    private String authorName;
    private String authorAddName;
    private int publicationDate;

    public Book() {

    }

    public Book(String title, String authorSurname, String authorName, String authorAddName, int publicationDate) {
        this.title = title;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
        this.authorAddName = authorAddName;
        this.publicationDate = publicationDate;
    }

    public Book(String title, String authorSurname, String authorName, int publicationDate) {
        this.title = title;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public Book(String title, String authorName, int publicationDate) {
        this.title = title;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorSurname() {
        return authorSurname == null ? "" : authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddName() {
        return authorAddName == null ? "" : authorAddName;
    }

    public void setAuthorAddName(String authorAddName) {
        this.authorAddName = authorAddName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate &&
                title.equals(book.title) &&
                Objects.equals(authorSurname, book.authorSurname) &&
                authorName.equals(book.authorName) &&
                Objects.equals(authorAddName, book.authorAddName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorSurname, authorName, authorAddName, publicationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QUOTE_LEFT + title);
        sb.append(QUOTE_RIGHT + (authorSurname == null ? "" : authorSurname));
        sb.append(SPACE + authorName);
        sb.append(SPACE + (authorAddName == null ? "" : authorAddName));
        sb.append(COMMA + publicationDate);
        return sb.toString();
    }

    @Override
    public int compareTo(Book book) {
        int resultCompareSurname = compareNullNames(this.authorSurname, book.authorSurname);
        int resultCompareName = this.authorName.compareToIgnoreCase(book.authorName);
        int resultCompareAddName = compareNullNames(this.authorAddName, book.authorAddName);
        if (resultCompareSurname != 0) {
            return resultCompareSurname;
        }
        if (resultCompareName != 0) {
            return resultCompareName;
        }
        return resultCompareAddName;
    }

    private int compareNullNames(String name1, String name2) {
        int resultCompare;
        if (name1 != null && name2 != null) {
            resultCompare = name1.compareToIgnoreCase(name2);
        } else if (name1 == null && name2 != null) {
            resultCompare = -name2.length();
        } else if (name1 != null && name2 == null) {
            resultCompare = name1.length();
        } else {
            resultCompare = 0;
        }
        return resultCompare;
    }
}
