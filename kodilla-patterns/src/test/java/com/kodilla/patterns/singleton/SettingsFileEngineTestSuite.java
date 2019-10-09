package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myApp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {

        //Given

        //When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myApp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //given

        //when
        boolean result = SettingsFileEngine.getInstance().loadSettings();

        //then
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSaveSettings() {
        //given

        //when
        boolean result = SettingsFileEngine.getInstance().saveSettings();

        //then
        Assert.assertEquals(true, result);
    }
}
