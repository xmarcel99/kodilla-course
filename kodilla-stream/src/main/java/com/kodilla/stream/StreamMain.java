package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamMain {

    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getYearsBeetwen() > 20)
                .filter(forumUser -> forumUser.getPublicatedPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        resultMap.entrySet().stream()
                .forEach(System.out::println);


        People people = new People();

        people.getList().stream()
                .forEach(System.out::println);

        people.getList().add("Marcel");

        people.getList().stream()
                .forEach(System.out::println);


    }
}