package com.kodilla.patterns2.observer.homework;

public class Student implements Observer {
    private final String username;
    private int updateCount;

    public Student(String username) {
        this.username = username;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(username + ": New homework has been posted " + homework.getModuleNumber() + ". " + homework.getSubmoduleNumber() + "\n" +
                " (total: " + homework.getHomeworkList().size() + " tries has been made.");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
