package com.cts.employeeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveDelivarable")
	public void saveDelivarable(@RequestBody DelivarableModel delivarableModel ) {
		
		this.employeeService.saveDelivarable(delivarableModel);
		
	}
}
