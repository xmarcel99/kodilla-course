package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        LocalDate twentyYearsAgo = LocalDate.of(LocalDate.now().getYear() - 20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(twentyYearsAgo))
                .filter(forumUser -> forumUser.getPublicatedPostCount()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

        resultMap.entrySet().stream()
                .forEach(System.out::println);


       ;



    }
}