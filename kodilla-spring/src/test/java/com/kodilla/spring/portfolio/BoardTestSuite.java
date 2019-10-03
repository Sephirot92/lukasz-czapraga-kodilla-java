package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Test
    public void testGetTaskFromDoneListInBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("1. Make Andrew Pleased");
        board.inProgressList.tasks.add("2.Making those stupid tests...");
        board.doneList.tasks.add("3.Board class is done");

        String test = board.doneList.getTasks().get(0);

        //Then
        System.out.println(test);
        Assert.assertEquals("3.Board class is done", test);

    }

    @Test
    public void testGetTaskFromInProgressListInBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("1. Make Andrew Pleased");
        board.inProgressList.tasks.add("2.Making those stupid tests...");
        board.doneList.tasks.add("3.Board class is done");

        String test = board.inProgressList.getTasks().get(0);
        //Then
        System.out.println(test);
        Assert.assertEquals("2.Making those stupid tests...", test);
    }

    @Test
    public void testGetTaskFromToDoListInBoard() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("1. Make Andrew Pleased");
        board.inProgressList.tasks.add("2.Making those stupid tests...");
        board.doneList.tasks.add("3.Board class is done");

        String test = board.toDoList.getTasks().get(0);

        //Then
        System.out.println(test);
        Assert.assertEquals("1. Make Andrew Pleased", test);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("1. Make Andrew Pleased");
        board.inProgressList.tasks.add("2.Making those stupid tests...");
        board.doneList.tasks.add("3.Board class is done");

        int numberOfTasksInToDo = board.toDoList.tasks.size();
        int numberOfTasksInProgress = board.inProgressList.tasks.size();
        int numberOfTasksDone = board.doneList.tasks.size();

        //Then
        Assert.assertEquals(1, numberOfTasksInToDo);
        Assert.assertEquals(1, numberOfTasksInProgress);
        Assert.assertEquals(1, numberOfTasksDone);
    }
}
