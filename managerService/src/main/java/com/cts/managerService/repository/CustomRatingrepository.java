package com.cts.managerService.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.cts.managerService.entityClass.RatingData;



@Repository
public class CustomRatingrepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private Logger logger = LoggerFactory.getLogger(CustomRatingrepository.class);
	
	public List<Integer> getRatingsByOrder(){
		//logger.info("EMPLOYEE ID ======= >>>>>>>>>    "+employeeId);
		TypedQuery<Integer> query = this.entityManager.createQuery("select r.employeeId from RatingData r group by r.employeeId order by avg(r.rating) desc", Integer.class);
		//query.setParameter("employeeId", employeeId);
		List<Integer> data = query.getResultList();
		return data;
		
	}
}
