package com.kodilla.spring.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.loadFromDb();
        //Then
        //Relax, do nothing :)
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        //Relax, do nothing :)
    }
}
