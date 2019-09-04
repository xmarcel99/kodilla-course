package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuites {

    @Test
    public void testCalculateWhenPostCountZeroAndCommentCountZero() {

        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        List<String> usersList = new ArrayList<>(Arrays.asList("Marcel"));
        when(statistics.usersNames()).thenReturn(usersList);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        double resultAverageCommentForUser = forumStatistics.averageCommentForUser;
        double resultAveragePostForUser = forumStatistics.averagePostForUser;


        //Then
        Assert.assertEquals(0.0, resultAveragePostForUser, 0.001);
        Assert.assertEquals(0.0, resultAverageCommentForUser, 0.001);
    }

    @Test
    public void testCalculateWhenCommentCountSmallerThenPostCountAndUsersCount100() {

        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("user" + i);
        }
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(50);
        when(statistics.postsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        double resultAverageCommentForPost = forumStatistics.averageCommentsForPost;
        double resultAveragePostForUser = forumStatistics.averagePostForUser;
        double resultAverageCommentForUser = forumStatistics.averageCommentForUser;

        //Then
        Assert.assertEquals(0.5, resultAverageCommentForPost, 0.001);
        Assert.assertEquals(1, resultAveragePostForUser, 0.001);
        Assert.assertEquals(0.5, resultAverageCommentForUser, 0.001);
    }

    @Test
    public void testCalculateWhenCommentsCountBiggerThanPostCountAndUsersCountZero() {

        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        double resultAverageCommentForPost = forumStatistics.averageCommentsForPost;

        //Then
        Assert.assertEquals(2, resultAverageCommentForPost, 0.001);


    }


}
