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
    public void testStatisticCounterWithMock0(){
        //Given
        Statistics statisticMock = mock(Statistics.class);

        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userNames.add("User" + i);
        }
        when(statisticMock.userNames()).thenReturn(userNames);

        ArrayList<Integer> postCount = new ArrayList<>();
        for (int j = 0; j < 1000; j++){
            postCount.add(j);
        }
        when(statisticMock.postCount()).thenReturn(postCount.size());

        ArrayList<Integer> commentsCount = new ArrayList<>();
        for (int k = 0; k <2000; k ++){
            commentsCount.add(k);
        }
        when(statisticMock.commentsCount()).thenReturn(commentsCount.size());

        StatisticsCounter statisticCounter = new StatisticsCounter(statisticMock.userNames().size(), statisticMock.postCount(), statisticMock.commentsCount());
        //When
        int totalNumberOfUsers = userNames.size();
        //Then
        Assert.assertEquals(100, totalNumberOfUsers);
        Assert.assertEquals(1000, statisticMock.postCount());
        Assert.assertEquals(2000, statisticMock.commentsCount());
        Assert.assertTrue(commentsCount.size() > postCount.size());
        statisticCounter.showStatistics();
    }
    @Test
    public void testStatisticCounterWithMock1(){
        //Given
        Statistics statisticMock = mock(Statistics.class);

        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 0; i++){
            userNames.add("User" + i);
        }
        when(statisticMock.userNames()).thenReturn(userNames);

        ArrayList<Integer> postCount = new ArrayList<>();
        for (int j = 0; j < 0; j++){
            postCount.add(j);
        }
        when(statisticMock.postCount()).thenReturn(postCount.size());

        ArrayList<Integer> commentsCount = new ArrayList<>();
        for (int k = 0; k <0; k ++){
            commentsCount.add(k);
        }
        when(statisticMock.commentsCount()).thenReturn(commentsCount.size());

        StatisticsCounter statisticCounter = new StatisticsCounter(statisticMock.userNames().size(), statisticMock.postCount(), statisticMock.commentsCount());
        //When
        int totalNumberOfUsers = userNames.size();
        //Then
        Assert.assertEquals(0, totalNumberOfUsers);
        Assert.assertEquals(0, postCount.size());
        Assert.assertEquals(0, commentsCount.size());
    }
    @Test
    public void testStatisticCounterWithMock2(){
        //Given
        Statistics statisticMock = mock(Statistics.class);

        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 500; i++){
            userNames.add("User" + i);
        }
        when(statisticMock.userNames()).thenReturn(userNames);

        ArrayList<Integer> postCount = new ArrayList<>();
        for (int j = 0; j < 1000; j++){
            postCount.add(j);
        }
        when(statisticMock.postCount()).thenReturn(postCount.size());

        ArrayList<Integer> commentsCount = new ArrayList<>();
        for (int k = 0; k <100; k ++){
            commentsCount.add(k);
        }
        when(statisticMock.commentsCount()).thenReturn(commentsCount.size());

        StatisticsCounter statisticCounter = new StatisticsCounter(statisticMock.userNames().size(), statisticMock.postCount(), statisticMock.commentsCount());
        //When
        int totalNumberOfUsers = userNames.size();
        //Then
        Assert.assertTrue(commentsCount.size() < postCount.size());
        statisticCounter.showStatistics();
    }
    @Test
    public void testStatisticCounterWithMock3(){
        //Given
        Statistics statisticMock = mock(Statistics.class);

        ArrayList<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userNames.add("User" + i);
        }
        when(statisticMock.userNames()).thenReturn(userNames);

        ArrayList<Integer> postCount = new ArrayList<>();
        for (int j = 0; j < 1000; j++){
            postCount.add(j);
        }
        when(statisticMock.postCount()).thenReturn(postCount.size());

        ArrayList<Integer> commentsCount = new ArrayList<>();
        for (int k = 0; k <0; k ++){
            commentsCount.add(k);
        }
        when(statisticMock.commentsCount()).thenReturn(commentsCount.size());

        StatisticsCounter statisticCounter = new StatisticsCounter(userNames.size(), postCount.size(), commentsCount.size());
        //When
        int totalNumberOfComments = commentsCount.size();
        //Then
        Assert.assertEquals(0, totalNumberOfComments);
        statisticCounter.showStatistics();
    }
}
