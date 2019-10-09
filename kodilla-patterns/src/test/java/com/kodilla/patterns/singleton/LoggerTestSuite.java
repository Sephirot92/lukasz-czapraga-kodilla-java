package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testLogSystem() {
        Logger.getInstance().log("Whassup?");
    }

    @Test
    public void testGetLog() {
        //Given

        //When
        String testLogHandler = Logger.getInstance().getLastLog();
        System.out.println("Opened " + testLogHandler);

        //Then
        Assert.assertEquals("Whassup?", testLogHandler);
    }
}
