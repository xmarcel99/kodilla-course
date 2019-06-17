package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private List<University> universityList = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentList")
    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }

    public Student() {

    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "student_id", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }
    @Column(name = "lastname")
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
