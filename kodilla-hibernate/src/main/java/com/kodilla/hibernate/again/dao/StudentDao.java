package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {

}
