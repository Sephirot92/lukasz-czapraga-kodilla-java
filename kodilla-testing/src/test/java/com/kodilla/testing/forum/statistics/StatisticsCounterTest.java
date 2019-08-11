package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTest {
    @Test
    public void testStatisticCounterWithMock(){
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

        StatisticsCounter statisticCounter = new StatisticsCounter(statisticMock);
        //When
        int totalNumberOfUsers = userNames.size();
        //Then
        Assert.assertEquals(100, totalNumberOfUsers);
    }
}
