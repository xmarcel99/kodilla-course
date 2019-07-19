package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observator{
    private String firstname;
    private int updateCounter;

    public Teacher(String name) {
        this.firstname = name;
    }

    @Override
    public void update(Homework homework) {
        System.out.println("New exercises to check from student: " + homework.getStudentFirstname() +" for: " +firstname);
        updateCounter++;
    }

    public int getUpdateCounter() {
        return updateCounter;
    }
}

