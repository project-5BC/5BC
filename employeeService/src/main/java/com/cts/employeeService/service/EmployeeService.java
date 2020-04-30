package com.cts.employeeService.service;

import org.springframework.stereotype.Service;

import com.cts.employeeService.modelClass.DelivarableModel;

@Service
public interface EmployeeService {
	public void saveDelivarable(DelivarableModel delivarableModel);
}
