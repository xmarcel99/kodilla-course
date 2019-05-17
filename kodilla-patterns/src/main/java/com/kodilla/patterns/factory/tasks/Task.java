package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface Task {
    default boolean executeTask(String element) {
        List<String> list = new ArrayList<>();
        System.out.println("Task is executing...");
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        switch (randomNumber) {
            case 0: list.add(element);
            case 1: list.clear();
        }
        if(list.contains(element)) {
            return  true;
        } else {
            return  false;
        }
    }
    String getTaskName();
    boolean isTaskExecuted();
}
