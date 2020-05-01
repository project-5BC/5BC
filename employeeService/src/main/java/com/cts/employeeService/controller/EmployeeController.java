package com.cts.employeeService.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.modelClass.DelivarableStatus;
import com.cts.employeeService.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("/saveDelivarable")
	public void saveDelivarable(@RequestBody DelivarableModel delivarableModel ) {
		
		logger.info("In Controller ==========>>>>>>>>>>>       "+delivarableModel.getEmployeeId());
		
		this.employeeService.saveDelivarable(delivarableModel);
		
	}
	
	@PutMapping("/updateRatingStatus")
	public void updatedelivarableRatingStatus(@RequestBody DelivarableStatus delivarableStatus) {
		
		this.employeeService.updateDelivarableRatingStatus(delivarableStatus);
	}
	
	@PutMapping("/updateReviewStatus")
	public void updatedelivarableReviewStatus(@RequestBody DelivarableStatus delivarableStatus) {
		
		this.employeeService.updateDelivarableReviewStatus(delivarableStatus);
	}
	
}
