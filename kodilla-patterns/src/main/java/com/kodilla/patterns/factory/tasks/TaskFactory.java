package com.kodilla.patterns.factory.tasks;

public final  class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public  final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("shopping list", "wather", 20);
            case PAINTING_TASK:
                return new PaintingTask("painting list", "white", "bedroom");
            case DRIVING_TASK:
                return new DrivingTask("driving list", "Warsaw", "plane");
            default: return  null;
        }

    }
}
