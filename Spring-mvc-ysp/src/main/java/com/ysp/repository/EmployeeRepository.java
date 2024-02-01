package com.ysp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ysp.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	
}
