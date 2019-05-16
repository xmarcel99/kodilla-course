package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
     SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }
    public String sharePost() {
        return socialPublisher.share();
    }
}
