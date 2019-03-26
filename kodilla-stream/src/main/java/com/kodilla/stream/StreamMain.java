package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMain {

    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getYearsBeetwen() > 20)
                .filter(forumUser -> forumUser.getPublicatedPostCount()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

        resultMap.entrySet().stream()
                .forEach(System.out::println);


        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(t -> t.length() > 11)
                .map(t -> t.substring(0,t.indexOf(" ")+2) + ".")
                .filter(t-> t.substring(0,1).equals("M"))
                .forEach(System.out::println);






    }
}