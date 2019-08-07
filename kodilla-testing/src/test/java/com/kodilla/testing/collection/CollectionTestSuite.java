package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("The test is about to begin. First we will see how does the empty arraylist acts");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("The test has ended. Good job.");
        System.out.println("Awaiting for Simons grade. Good luck.");
    }
    @Before
    public void before(){
        System.out.println("\nTest is about to start");
    }
    @After
    public void after(){
        System.out.println("Test completed. Proceeding.\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Checking for an empty list");
        //act
        int result = numbers.size();
        System.out.println("The size of an ArrayList named numbers is " + numbers.size());
        //assert
        Assert.assertEquals(result, 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int j = 0; j < 50; j++){
            numbers.add(j);
        }
        System.out.println("List has been created. It contains both even and odd numbers");
        //act
        int result = numbers.size();
        System.out.println("The size of an ArrayList named numbers is " + numbers.size());
        //assert
        Assert.assertEquals(result, 50);
    }
    @Test
    public void testingExterminator(){
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int j = 0; j < 50; j++){
            numbers.add(j);
        }
        System.out.println("Now the integers have been added to the list");
        //act
        System.out.println("Warning! Exterminator have been activated!");
        OddNumbersExterminator.exterminate(numbers);
        int result = numbers.size();
        System.out.println("The size of an ArrayList only with even numbers is " + numbers.size());
        //assert
        Assert.assertEquals(numbers.size(),25);
    }
}

