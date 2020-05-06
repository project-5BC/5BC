package com.cts.employeeService.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cts.employeeService.entityClass.Delivarable;
import com.cts.employeeService.entityClass.User;
import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.modelClass.DelivarableStatus;
import com.cts.employeeService.repository.CustomRepository;
import com.cts.employeeService.repository.DelivarableRepository;
import com.cts.employeeService.repository.UserRepository;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CustomRepository customRepo;
	
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
	
	@Override
	public ResponseEntity<List<Integer>> getEmployeeIds(Integer managerId){
		
		List<User> userList = this.userRepository.findBymanagerId(managerId);
		List<Integer> data = new ArrayList<Integer>();
		userList.stream().forEach(user->
				data.add(user.getUserId())
				);
		ResponseEntity<List<Integer>> result = new ResponseEntity<List<Integer>>(data,HttpStatus.OK);
		return result;
		
	}


	@Override
	public ResponseEntity<List<Delivarable>> getDelivarablesByEmployeeId(Integer employeeId) {
		// TODO Auto-generated method stub
		List<Delivarable> list = this.delivarableRepository.findByemployeeId(employeeId);
		ResponseEntity<List<Delivarable>> result  = new  ResponseEntity<List<Delivarable>>(list,HttpStatus.OK);
		return result;
	}


	@Override
	public ResponseEntity<User> getUserByManagerId(Integer employeeId, Integer managerId) {
		// TODO Auto-generated method stub
		User user = this.customRepo.getEmployeeDetails(employeeId, managerId);
		ResponseEntity<User> result  = new ResponseEntity<User>(user,HttpStatus.OK);
		return result;
	}

}
