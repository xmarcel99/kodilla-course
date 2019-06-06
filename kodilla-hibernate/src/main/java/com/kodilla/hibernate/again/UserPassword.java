package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER_PASSWORD")
public class UserPassword {
    private String password;
    private int id;

    public UserPassword() {

    }

    public UserPassword(String password) {
        this.password = password;
    }
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setId(int id) {
        this.id = id;
    }
}
