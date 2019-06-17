package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UniversityDao extends CrudRepository<University,Integer> {
    List<University> findById(int id);

}
