package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user = new Millenials("Johny");
        User user1 = new YGeneration("Lexy");
        User user2 = new ZGeneration("Houston");
        //When
        String snapchatUser = user.sharePost();
        String facebookUser = user1.sharePost();
        String twitterUser = user2.sharePost();
        //When
        Assert.assertEquals("Snapchat User",snapchatUser);
        Assert.assertEquals("Facebook User",facebookUser);
        Assert.assertEquals("Twitter User",twitterUser);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new YGeneration("John");
        //When
        user.setSocialPublisher(new SnapchatPublisher());
        String result = user.sharePost();
        //Then
        Assert.assertEquals("Snapchat User",result);
    }
}
