package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        HashSet<Book> bookHashSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        for (int i = 1; i < 5; i++) {
            bookHashSet.add(new Book("Author " + i, "Title " + i, 1900 + i, "Signature " + i));
        }
        //When
        int median = medianAdapter.publicationYearMedian(bookHashSet);

        //Then
        Assert.assertEquals(1902, median);
    }
}
