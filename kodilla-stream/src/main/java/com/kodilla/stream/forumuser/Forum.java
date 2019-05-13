package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1901, "xmarcel99", 'M', 1, 1990, 9, 17));
        forumUserList.add(new ForumUser(1900, "john", 'M', 100, 1900, 12, 16));
        forumUserList.add(new ForumUser(1902, "xmarcel99", 'M', 1, 2002, 9, 17));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
