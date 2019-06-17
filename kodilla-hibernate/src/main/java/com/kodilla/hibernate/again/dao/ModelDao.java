package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
interface ModelDao extends CrudRepository<Model,Integer> {
}
