package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private Teacher teacher;
    private List<String> homeworks;
    private String studentFirstname;

    public Homework(String studentFirstname, Teacher teacher) {
        this.teacher = teacher;
        this.homeworks = new ArrayList<>();
        this.studentFirstname = studentFirstname;
    }

    @Override
    public void addTask(String task) {
        homeworks.add(task);
        notifyTeacher();
    }

    @Override
    public void notifyTeacher() {
        teacher.update(this);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
