package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void sendHomework(Homework homework);

    void gradeHomework();

    void acceptHomework(Observer observer);

    void notifyObservers();
}
