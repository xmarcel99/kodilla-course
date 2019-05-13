package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int usersCount;
    int postCount;
    int commentsCount;
    double averagePostForUser;
    double averageCommentForUser;
    double averageCommentsForPost;
    Statistics statistics;


    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        averagePostForUser = postCount / (double) usersCount;
        averageCommentForUser = commentsCount / (double) usersCount;
        averageCommentsForPost = commentsCount / (double) postCount;


    }

    public void showStatistics() {

        System.out.println("Users count: " + usersCount);
        System.out.println("Post count: " + postCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average post for user: " + averagePostForUser);
        System.out.println("Average comments for user: " + averageCommentForUser);
        System.out.println("Average comments for post: " + averageCommentsForPost);
    }

}
