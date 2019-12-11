
package com.kodilla.testing.library;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBookWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBook(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBookWithConditionMoreThan20() {
        //Give
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBook(15);
        List<Book> resultListOf40Books = generateListOfNBook(40);
        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBookWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBook(10);
        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("an");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());
    }

    @Test
    public void testLibraryUserWith0Books() {
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser user1 = new LibraryUser("Johhn", "Howard", "85122563975");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultList0 = new ArrayList<Book>();

        when(libraryDatabaseMock.listBookInHAndsOf(user1)).thenReturn(resultList0);

        //when
        List<Book> theListOf0Books = bookLibrary.listBooksInHadsOf(user1);

        //then
        Assert.assertEquals(0, theListOf0Books.size());
    }

    @Test
    public void testLibraryUserWith1Book() {
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser user1 = new LibraryUser("Johhn", "Howard", "85122563975");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultList0 = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        resultList0.add(book1);

        when(libraryDatabaseMock.listBookInHAndsOf(user1)).thenReturn(resultList0);

        //when
        List<Book> theListOf0Books = bookLibrary.listBooksInHadsOf(user1);

        //then
        Assert.assertEquals(1, theListOf0Books.size());
    }

    @Test
    public void testLibraryUserWith5Books() {
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser user1 = new LibraryUser("Johhn", "Howard", "85122563975");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultList0 = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Harry Throtter", "Me", 2019);
        resultList0.add(book1);
        resultList0.add(book2);
        resultList0.add(book3);
        resultList0.add(book4);
        resultList0.add(book5);


        when(libraryDatabaseMock.listBookInHAndsOf(user1)).thenReturn(resultList0);

        //when
        List<Book> theListOf0Books = bookLibrary.listBooksInHadsOf(user1);

        //then
        Assert.assertEquals(5, theListOf0Books.size());
    }
}
