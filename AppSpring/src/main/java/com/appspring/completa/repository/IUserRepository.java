package com.appspring.completa.repository;


import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appspring.completa.model.User;

 

@Repository
public interface IUserRepository extends CrudRepository<User, Long>{

	public Set<User> findByUsername(String username);
	

}
