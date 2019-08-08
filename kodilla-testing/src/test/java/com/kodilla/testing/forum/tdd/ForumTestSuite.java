package com.kodilla.testing.forum.tdd;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter =0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the begginign of the tests");

    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All test finished");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing test number " + testCounter);
    }


}
