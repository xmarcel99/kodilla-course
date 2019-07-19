package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Homework implements Observable {
    private Teacher teacher;
    private Deque<String> homeworks;
    private String studentFirstname;

    public Homework(String studentFirstname, Teacher teacher) {
        this.teacher = teacher;
        this.homeworks = new ArrayDeque<>();
        this.studentFirstname = studentFirstname;
    }

    @Override
    public void addTask(String task) {
        homeworks.offerLast(task);
        notifyTeacher();
    }

    @Override
    public void notifyTeacher() {
        teacher.update(this);
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

}
