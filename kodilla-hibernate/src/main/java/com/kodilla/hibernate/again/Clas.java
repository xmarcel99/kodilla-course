package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CLASES")
public class Clas {
    private int id;
    private String className;
    private List<Teacher> teacherList = new ArrayList<>();

    public Clas() {

    }

    public Clas(String className) {
        this.className = className;
    }
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "clasList")
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "CLAS_ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "CLASSNAME")
    public String getClassName() {
        return className;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setClassName(String className) {
        this.className = className;
    }

}
