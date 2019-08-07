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
        System.out.println("Warning! Exterminator have been activated!");
        OddNumbersExterminator.exterminate(numbers);
        int result = numbers.size();
        System.out.println("The size of an ArrayList only with even numbers is " + numbers.size());
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
        System.out.println("Now the integers have been added to the list");
        //act
        System.out.println("Warning! Exterminator have been activated!");
        OddNumbersExterminator.exterminate(numbers);
        int result = numbers.size();
        System.out.println("The size of an ArrayList only with even numbers is " + numbers.size());
        //assert
        boolean isEven = true;
        for (int j = 0; j < numbers.size(); j++){

            if((numbers.get(j) %2) ==0){
                isEven = true;
            }else {
                System.out.println("You failed badly...");
                isEven = false;
            }
        }
        System.out.println("Example elements of the array are: "+ numbers.get(5) + ", " + numbers.get(8) + ", " + numbers.get(12));
        Assert.assertEquals(isEven, true);
        System.out.println("Test completed. Array is made only from even numbers.");
    }
}