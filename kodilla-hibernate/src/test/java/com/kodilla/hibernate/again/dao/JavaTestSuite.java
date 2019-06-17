package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Car;
import com.kodilla.hibernate.again.Model;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaTestSuite {
    @Autowired
    CarDao carDao;
    @Test
    public void testModel() {
        //Given
        Car audi = new Car("audi");
        Model rs5 = new Model("rs5");
        Model a5 = new Model("a5");
        audi.getModelList().add(rs5);
        audi.getModelList().add(a5);
        rs5.setCar(audi);
        a5.setCar(audi);
        //When
        carDao.save(audi);
        List<Car> resultList = carDao.selectAll("audi");
        //Then
        Assert.assertEquals(1,resultList.size());
        //Clean up
        carDao.deleteById(audi.getId());
    }
}
