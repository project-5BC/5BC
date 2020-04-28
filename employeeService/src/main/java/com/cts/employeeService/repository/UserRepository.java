package com.cts.employeeService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.employeeService.entityClass.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByuserName(String username);

}

