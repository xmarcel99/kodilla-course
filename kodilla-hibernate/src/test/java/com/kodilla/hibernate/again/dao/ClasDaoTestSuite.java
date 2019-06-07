package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Clas;
import com.kodilla.hibernate.again.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClasDaoTestSuite {
    @Autowired
    ClasDao clasDao;
    @Test
    public void testXD() {
        //Given
        Teacher teacher = new Teacher("Joanna","Obidowicz");
        Teacher teacher1 = new Teacher("Paweł","Kotlarczyk");
        Teacher teacher2 = new Teacher("Jakub","Puchała");

        Clas clas = new Clas("MAT");
        Clas clas1 = new Clas("FIZ");
        Clas clas2 = new Clas("WF");

        teacher.getClasList().add(clas);
        clas.getTeacherList().add(teacher);

        teacher1.getClasList().add(clas1);
        clas1.getTeacherList().add(teacher1);

        teacher2.getClasList().add(clas2);
        clas2.getTeacherList().add(teacher2);
        //When
        clasDao.save(clas);
        int clasId = clas.getId();
        clasDao.save(clas1);
        int clas11d = clas1.getId();
        clasDao.save(clas2);
        int clas2Id = clas2.getId();
        //Then
        Assert.assertNotEquals(0,clasId);
        Assert.assertNotEquals(0,clas11d);
        Assert.assertNotEquals(0,clas2Id);
        //Clean up
        clasDao.deleteById(clasId);
        clasDao.deleteById(clas11d);
        clasDao.deleteById(clas2Id);

    }
}
