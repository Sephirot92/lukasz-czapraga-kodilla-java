package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationTime;

    public Book(String title, String author, LocalDate publicationTime) {
        this.title = title;
        this.author = author;
        this.publicationTime = publicationTime;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationTime() {
        return publicationTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationTime=" + publicationTime +
                '}' + "\n";
    }
}
