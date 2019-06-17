package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
interface CarDao extends CrudRepository<Car,Integer> {
    List<Car> findByCarFactory(String carFactory);
    List<Car> selectAll(@Param("parametr") String parametr);
}
