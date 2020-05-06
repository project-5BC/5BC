package com.cts.employeeService.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cts.employeeService.entityClass.User;

@Repository
public class CustomRepository {

	
	@PersistenceContext
	EntityManager entityManager;
	
	public User getEmployeeDetails(Integer employeeId,Integer managerId) {
		TypedQuery<User> query = this.entityManager.createNamedQuery(
				"select u from User u where userId:=employeeId and managerId=:managerId",User.class);
		query.setParameter("employeeId", employeeId);
		query.setParameter("managerId", managerId);
		User user = query.getSingleResult();
		return user;
	}
}
