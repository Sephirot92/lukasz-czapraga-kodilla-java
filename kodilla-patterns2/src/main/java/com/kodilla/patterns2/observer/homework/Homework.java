package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework implements Observable {
    private final int moduleNumber;
    private final int submoduleNumber;
    private final List<String> messages;
    private final List<Observer> observers;
    private final List<Homework> homeworkList;
    private boolean isAccepted;

    public Homework(int moduleNumber, int submoduleNumber) {
        this.moduleNumber = moduleNumber;
        this.submoduleNumber = submoduleNumber;
        this.isAccepted = false;
        messages = new ArrayList<>();
        observers = new ArrayList<>();
        homeworkList = new ArrayList<>();
    }

    @Override
    public void sendHomework(Homework homework) {
        homeworkList.add(homework);
        messages.add("Homework has been send");
        notifyObservers();
    }

    @Override
    public void gradeHomework() {
        Random random = new Random();
        isAccepted = random.nextBoolean();
        notifyObservers();
    }

    @Override
    public void acceptHomework(Observer observer) {
        if (isAccepted) {
            messages.add("Your homework has been accepted");
            observers.add(observer);
        } else {
            messages.add("Your homework needs upgrades!");
        }
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public int getModuleNumber() {
        return moduleNumber;
    }

    public int getSubmoduleNumber() {
        return submoduleNumber;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<Homework> getHomeworkList() {
        return homeworkList;
    }
}
