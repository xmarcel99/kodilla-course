package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TEACHERS")
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;
    private List<Clas> clasList = new ArrayList<>();

    public Teacher() {

    }

    public Teacher(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_CLASS_AND_TEACHERS",
            joinColumns = {@JoinColumn(name = "TEACHER_ID",referencedColumnName = "TEACHER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CLAS_ID",referencedColumnName = "CLAS_ID")}
    )
    public List<Clas> getClasList() {
        return clasList;
    }

    public void setClasList(List<Clas> clasList) {
        this.clasList = clasList;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "TEACHER_ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
