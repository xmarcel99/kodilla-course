package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1987,"xmarcel99",'M',1,1998,9,17));
        forumUserList.add(new ForumUser(1900,"john",'M',100,1989,12,16));
        forumUserList.add(new ForumUser(2005,"katy",'F',432,1997,5,26));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
