package com.kodilla.hibernate.again.dao;

import com.kodilla.hibernate.again.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PostDao extends CrudRepository<Post,Integer> {

}
