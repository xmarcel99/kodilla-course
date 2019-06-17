package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Student;
import com.kodilla.hibernate.again.University;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniversityTestSuite {
    @Autowired
    UniversityDao universityDao;
    @Test
    public void testUniversity() {
        //Given
        University university = new University("AGH");
        University university1 = new University("UEK");
        Student student = new Student("Klaudia","Dudziak");
        Student student1 = new Student("Marcel","Sztur");
        university1.getStudentList().add(student);
        university1.getStudentList().add(student1);
        university.getStudentList().add(student);
        university.getStudentList().add(student1);
        student.getUniversityList().add(university);
        student1.getUniversityList().add(university);
        student.getUniversityList().add(university1);
        student1.getUniversityList().add(university1);
        //When
        universityDao.save(university);
        universityDao.save(university1);
        List<University> resultlist = universityDao.findById(university.getId());
        //Then
        Assert.assertEquals(1,resultlist.size());
        //Clean up

    }
}
