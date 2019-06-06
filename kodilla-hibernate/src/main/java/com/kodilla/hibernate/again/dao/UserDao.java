package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
    List<User> findByAge(int age);
}
