package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void getBooks() {
        //given
        //creating the library number One
        Library libraryOne = new Library("Library Number One");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> libraryOne.getBooks().add(new Book("Book " + n, "Author " + n, LocalDate.now())));

        //making a shallow copy of Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = libraryOne.shallowCopy();
            clonedLibrary.setName("Library Number Two");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of Library
        Library deepLibraryCopy = null;
        try {
            deepLibraryCopy = libraryOne.deepCopy();
            deepLibraryCopy.setName("Deep Copied Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(libraryOne.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepLibraryCopy.getBooks());
        //when
        libraryOne.getBooks().clear();
        //then
        Assert.assertEquals(0, libraryOne.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepLibraryCopy.getBooks().size());
        Assert.assertNotEquals(deepLibraryCopy, libraryOne);
    }
}
