package com.cts.employeeService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employeeService.entityClass.Delivarable;
import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.repository.DelivarableRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private DelivarableRepository delivarableRepository;
	
	
	@Override
	public void saveDelivarable(DelivarableModel delivarableModel) {
		
		Delivarable data = new Delivarable();
		data.setEmployeeId(delivarableModel.getEmployeeId());
		data.setPojectName(delivarableModel.getProjectname());
		data.setRemarks(delivarableModel.getRemarks());
		data.setRated(false);
		data.setReviewed(false);
		
		this.delivarableRepository.save(data); 

	}

}
