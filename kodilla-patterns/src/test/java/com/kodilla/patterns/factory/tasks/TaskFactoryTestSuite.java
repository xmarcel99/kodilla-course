package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("driving list", task.getTaskName());
    }

    @Test
    public void testPaintingTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("painting list", task.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("shopping list",task.getTaskName());
    }

}
