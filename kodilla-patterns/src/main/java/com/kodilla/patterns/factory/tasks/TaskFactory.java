package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy Groceries", "Tomatoes, Onions, Olives", 20);
            case DRIVING:
                return new DrivingTask("Drive Grandma to doc", "Hospital", "Car");
            case PAINTING:
                return new PaintingTask("Paint room", "Red", "Room");
            default:
                return null;
        }
    }
}
