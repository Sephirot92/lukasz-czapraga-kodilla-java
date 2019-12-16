package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StudentTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework homework01 = new HomeworkJava01();
        Homework homework02 = new HomeworkJava02();
        Sage andrew = new Sage("Interceptor");
        Student luke = new Student("Lucas");
        homework01.sendHomework(homework01);
        //When
        homework01.gradeHomework();
        boolean test = homework01.isAccepted();
        //Then
        assertEquals(test, true);
    }
}
