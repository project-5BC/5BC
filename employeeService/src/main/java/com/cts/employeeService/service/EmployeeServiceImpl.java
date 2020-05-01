package com.cts.employeeService.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employeeService.entityClass.Delivarable;
import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.modelClass.DelivarableStatus;
import com.cts.employeeService.repository.DelivarableRepository;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private DelivarableRepository delivarableRepository;
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void saveDelivarable(DelivarableModel delivarableModel) {
		
		Delivarable data = new Delivarable();
		data.setEmployeeId(delivarableModel.getEmployeeId());
		logger.info("EmpId========>>>>>>>>>    "+delivarableModel.getEmployeeId());
		data.setPojectName(delivarableModel.getProjectname());
		data.setRemarks(delivarableModel.getRemarks());
		data.setRated(false);
		data.setReviewed(false);
		
		this.delivarableRepository.save(data); 

	}


	@Override
	public void updateDelivarableRatingStatus(DelivarableStatus delivarableStatus) {
		// TODO Auto-generated method stub
		Delivarable data = new Delivarable();
		data.setId(delivarableStatus.getDelivarableId());
		data.setEmployeeId(delivarableStatus.getEmployeeId());
		data.setPojectName(delivarableStatus.getProjectname());
		data.setRemarks(delivarableStatus.getRemarks());
		data.setRated(true);
		data.setReviewed(false);
		
		this.delivarableRepository.save(data);
	}


	@Override
	public void updateDelivarableReviewStatus(DelivarableStatus delivarableStatus) {
		// TODO Auto-generated method stub
		Delivarable data = new Delivarable();
		data.setId(delivarableStatus.getDelivarableId());
		data.setEmployeeId(delivarableStatus.getEmployeeId());
		data.setPojectName(delivarableStatus.getProjectname());
		data.setRemarks(delivarableStatus.getRemarks());
		data.setRated(true);
		data.setReviewed(true);
		
		this.delivarableRepository.save(data);
	}

}
