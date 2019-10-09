package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //given
        //creating TaskList for todos
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number " + n)));

        //creating TaskList for tasks in Progress
        TaskList listInProgress = new TaskList("In Progress");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress task number " + n)));

        //creating TaskList for done tasks
        TaskList listDoneTasks = new TaskList("Done tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDoneTasks.getTasks().add(new Task("Done task number " + n)));

        //creating the board to assigning tasklist
        Board board = new Board("Project Number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDoneTasks);

        //making a shallow copy of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project Number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        board.getLists().remove(listToDo);

        //then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, cloneBoard.getLists().size());
        Assert.assertEquals(3, deepCloneBoard.getLists().size());
        Assert.assertEquals(cloneBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepCloneBoard.getLists(), board.getLists());
    }

}
