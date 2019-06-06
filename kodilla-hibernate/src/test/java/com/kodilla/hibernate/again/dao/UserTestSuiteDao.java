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
public class UserTestSuiteDao {
    @Autowired
    UserDao userDao;
    @Test
    public void testUserDao() {
        //Given
        User user = new User(30,"Marcel","Sztur");
        user.setUserPassword(new UserPassword("12345"));
        userDao.save(user);
        //Given
        int resultId = user.getId();
        //Then
        Assert.assertNotEquals(1000,resultId);
    }
}
