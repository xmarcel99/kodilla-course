package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observator{
    private String firstname;
    private int updateCounter;

    public Teacher(String name) {
        this.firstname = name;
    }

    @Override
    public void update(KodillaStudent kodillaStudent) {
        System.out.println("New exercises to check from student: " + kodillaStudent.getStudentFirstname() +" for: " +firstname);
        updateCounter++;
    }

    public int getUpdateCounter() {
        return updateCounter;
    }
}

