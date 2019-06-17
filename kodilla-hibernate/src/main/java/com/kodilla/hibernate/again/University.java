package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    private int id;
    private String universityName;
    private List<Student> studentList = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "university_and_students",
            joinColumns = {@JoinColumn(name = "university_id",referencedColumnName = "university_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "student_id")}
    )
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public University() {

    }

    public University(String universityName) {
        this.universityName = universityName;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "university_id",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "university_name")
    public String getUniversityName() {
        return universityName;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
