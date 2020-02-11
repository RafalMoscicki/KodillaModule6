package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void test1CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 0;
        int commentCount = 100;
        List<String> users = new ArrayList<String>();
        users.add("Rob");
        users.add("Tom");
        users.add("Pixel");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[3,0,100,0.0,0.03,0.0]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }

    @Test
    public void test2CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1000;
        int commentCount = 10;
        List<String> users = new ArrayList<String>();
        users.add("Rob");
        users.add("Tom");
        users.add("Pixel");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[3,1000,10,0.003,0.3,0.01]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }

    @Test
    public void test3CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1000;
        int commentCount = 0;
        List<String> users = new ArrayList<String>();
        users.add("Rob");
        users.add("Tom");
        users.add("Pixel");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[3,1000,0,0.003,0.0,0.0]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }
    @Test
    public void test4CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 200;
        int commentCount = 100;
        List<String> users = new ArrayList<String>();
        users.add("Rob");
        users.add("Tom");
        users.add("Pixel");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[3,200,100,0.015,0.03,0.5]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }

    @Test
    public void test5CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        int commentCount = 200;
        List<String> users = new ArrayList<String>();
        users.add("Rob");
        users.add("Tom");
        users.add("Pixel");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[3,100,200,0.03,0.015,2.0]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }

    @Test
    public void test6CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        int commentCount = 100;
        List<String> users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[0,100,100,0.0,0.0,1.0]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }

    @Test
    public void test7CalculateStatistics() {
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        int commentCount = 200;
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        String expected = "[100,100,200,1.0,0.5,2.0]";

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        // when
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(expected, statisticsCalculator.showStatistics());
    }
}
