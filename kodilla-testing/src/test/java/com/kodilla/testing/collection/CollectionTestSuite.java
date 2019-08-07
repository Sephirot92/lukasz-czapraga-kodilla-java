package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void before() {
        System.out.println("The test is about to begin. First we will see how does the empty arraylist acts");
    }
    @AfterClass
    public static void afterclass(){
        System.out.println("The test has ended. Good job.");
        System.out.println("Awaiting for Simons grade. Good luck.");
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
        System.out.println("First test accomplished. ArrayList is empty. Starting test number two");
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
        System.out.println("Third test accomplished. ArrayList contains both even and odd numbers.");
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
        System.out.println("Second test accomplished. ArrayList is containing only even numbers.Starting test number three");
    }
}

