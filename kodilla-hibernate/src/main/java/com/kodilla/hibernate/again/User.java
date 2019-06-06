package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class User  {
    private int id;
    private int age;
    private String firstName;
    private String lastname;
    private UserPassword userPassword;

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
}
