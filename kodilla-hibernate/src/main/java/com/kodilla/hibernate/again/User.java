package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS")
@Access(AccessType.FIELD)
public class User  {
    private int id;
    private int age;
    private String firstName;
    private String lastname;
    private UserPassword userPassword;
    private List<Post> postList = new ArrayList<>();

    public User() {

    }
    public User(int age, String firstName, String lastname) {
        this.age = age;
        this.firstName = firstName;
        this.lastname = lastname;
    }
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_PASSWORD_ID")
    public UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "AGE")
    public int getAge() {
        return age;
    }
    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @OneToMany(
            targetEntity = Post.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
