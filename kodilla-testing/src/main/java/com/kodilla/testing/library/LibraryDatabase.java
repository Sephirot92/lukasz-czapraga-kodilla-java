package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //list books having title beggining with titleFragment
    List<Book> listBookWithCondition(String titleFragment);

    //list book borrowed by libraryUser
    List<Book> listBookInHAndsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //returns true when success
    //and returns false when book is unavaible to rent
    boolean rentABook (LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned back
    int returnBooks(LibraryUser libraruUser);
}
