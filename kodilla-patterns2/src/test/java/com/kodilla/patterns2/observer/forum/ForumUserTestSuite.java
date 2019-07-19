package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        JavaHelpForumTopic javaHelpForumTopic = new JavaHelpForumTopic("Java Help Forum");
        JavaToolsForumTopic javaToolsForumTopic = new JavaToolsForumTopic("Java Tools Forum");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonceEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForumTopic.registerObserver(johnSmith);
        javaToolsForumTopic.registerObserver(ivonceEscobar);
        javaHelpForumTopic.registerObserver(jessiePinkman);
        javaToolsForumTopic.registerObserver(jessiePinkman);
        //When
        javaHelpForumTopic.addPost("Hi everyone ! Could you help me with for loop");
        javaHelpForumTopic.addPost("Better try use while loop in this case");
        javaToolsForumTopic.addPost("help pls my sql db don't want to work");
        javaHelpForumTopic.addPost("Why while ? It is better ? ");
        javaToolsForumTopic.addPost("When I want to log I have bad creditians message");
        //Then
        Assert.assertEquals(3,johnSmith.getUpdateCount());
        Assert.assertEquals(5,jessiePinkman.getUpdateCount());
        Assert.assertEquals(2,ivonceEscobar.getUpdateCount());
    }
}
