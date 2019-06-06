package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.User;
import com.kodilla.hibernate.again.UserPassword;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTestSuiteDao {
    @Autowired
    UserDao userDao;
    @Test
    public void testUserDao() {
        //Given
        User user = new User(19,"Marcel","Sztur");
        user.setUserPassword(new UserPassword("12345"));
        userDao.save(user);
        //Given
        List<User> resultList = userDao.findByAge(19);
        int resultListSize = resultList.size();
        //Then
        Assert.assertEquals(1,resultListSize);
        //CleanUp
        userDao.deleteById(user.getId());

    }
}
