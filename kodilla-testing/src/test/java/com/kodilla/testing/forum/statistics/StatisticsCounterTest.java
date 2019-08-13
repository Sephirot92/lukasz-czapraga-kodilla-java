package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTest {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beggining of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("\nPreparing to execute test number " + testCounter + "\n");
    }

    @Test
    public void statisticsWithMock1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            userNames.add("User" + i);
        }

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCounter counter = new StatisticsCounter();

        //When
        int totalNumberOfUsers = 100;
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(totalNumberOfUsers, counter.usersNumber);
        counter.showStatistics();
    }
    @Test
    public void statisticsWithMock2() throws java.lang.ArithmeticException{

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 0; i ++){
            userNames.add("User" + i);
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCounter counter = new StatisticsCounter();

        //When
        int totalNumberOfUsers = 0;
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(totalNumberOfUsers, counter.usersNumber);
        counter.showStatistics();
    }
    @Test
    public void statisticsWithMock3(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            userNames.add("User" + i);
        }
        ArrayList<Integer> postCount = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i ++){
            postCount.add(i);
        }
        ArrayList<Integer> commentsCount = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i ++){
            commentsCount.add(i);
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(10000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertTrue(counter.getCommentsNumber() < counter.getPostsNumber());
        counter.showStatistics();
    }
    @Test
    public void statisticsWithMock4(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            userNames.add("User" + i);
        }
        ArrayList<Integer> postCount = new ArrayList<Integer>();
        for(int i = 0; i < 200; i ++){
            postCount.add(i);
        }
        ArrayList<Integer> commentsCount = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i ++){
            commentsCount.add(i);
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(counter.commentsNumber > counter.postsNumber);
        counter.showStatistics();
    }
}
