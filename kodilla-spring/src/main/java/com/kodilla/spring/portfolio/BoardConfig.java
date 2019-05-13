package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Bean
    public TaskList toDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList doneList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }
}
