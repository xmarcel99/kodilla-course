package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.User;
import com.kodilla.hibernate.again.UserPassword;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPasswordDaoTestSuite {

    @Autowired
    UserPasswordDao userPasswordDao;
    @Test
    public void testUserDao() {
        //Given
        UserPassword userPassword = new UserPassword("12345");
        userPasswordDao.save(userPassword);
        //When
        int resultId = userPassword.getId();
        //Then
        Assert.assertNotEquals(100,resultId);
        //Clean up
        userPasswordDao.deleteById(resultId);
    }
}
