package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> booksMap = new HashMap<>();
        int median = 0;
        for (int i = 0; i < 10; i++)
            booksMap.put(new BookSignature(bookSet.iterator().next().getSignature()),
                    new Book(bookSet.iterator().next().getAuthor(), bookSet.iterator().next().getTitle(),
                            bookSet.iterator().next().getPublicationYear(), bookSet.iterator().next().getSignature()));
        if (booksMap.entrySet().iterator().hasNext()) {
            median += booksMap.entrySet().iterator().next().getValue().getPublicationYear();
        }
        return median;
    }
}
