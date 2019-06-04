package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDoTask","Clean car");
        //WHen
        taskListDao.save(taskList);
        int id = taskList.getId();
        List<TaskList> resultList = taskListDao.findByListName("ToDoTask");
        int resultSize = resultList.size();
        //Then
        Assert.assertEquals(1,resultSize);
        //Clean up
        taskListDao.deleteById(id);
    }
}
