package com.ysp.repositeries;

import org.springframework.data.repository.CrudRepository;

import com.ysp.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
