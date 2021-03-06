package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {

    private final Integer userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int publicatedPostCount;

    public ForumUser(final Integer userId, final String username, final char sex, final int publicatedPostCount, final int year, final int month, final int day) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.publicatedPostCount = publicatedPostCount;
    }


    public char getSex() {
        return sex;
    }

    public int getPublicatedPostCount() {
        return publicatedPostCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public int getYearsBeetwen() {

        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publicatedPostCount=" + publicatedPostCount +
                '}';
    }
}
