package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPainting() {
        //given
        TaskFactory painting = new TaskFactory();
        //When
        Task roomToBePainted = painting.createTask(TaskFactory.PAINTING);
        String taskName = roomToBePainted.getTaskName();
        //then
        Assert.assertEquals("Paint room", taskName);
    }

    @Test
    public void testFactoryDriving() {
        //given
        TaskFactory driving = new TaskFactory();
        //when
        Task driveGrandmaToDoc = driving.createTask(TaskFactory.DRIVING);
        String taskName = driveGrandmaToDoc.getTaskName();
        //then
        Assert.assertEquals("Drive Grandma to doc", taskName);
    }

    @Test
    public void testFactoryShopping() {
        //given
        TaskFactory shopping = new TaskFactory();
        //when
        Task makeShopping = shopping.createTask(TaskFactory.SHOPPING);
        String taskName = makeShopping.getTaskName();
        //then
        Assert.assertEquals("Buy Groceries", taskName);
    }
}
