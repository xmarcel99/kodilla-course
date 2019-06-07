package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "POSTS")
public class Post {
    private int id;
    private String body;
    private User user;

    public Post() {

    }

    public Post(String body) {
        this.body = body;
    }
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "POST_BODY")
    public String getBody() {
        return body;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setBody(String body) {
        this.body = body;
    }
}
