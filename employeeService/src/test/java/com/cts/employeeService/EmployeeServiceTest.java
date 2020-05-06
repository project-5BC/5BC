package com.cts.employeeService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.employeeService.entityClass.Delivarable;
import com.cts.employeeService.modelClass.DelivarableModel;
import com.cts.employeeService.repository.CustomRepository;
import com.cts.employeeService.repository.DelivarableRepository;
import com.cts.employeeService.repository.UserRepository;
import com.cts.employeeService.service.EmployeeServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceTest {
	
	@InjectMocks
	private EmployeeServiceImpl empService;
	
	@Mock
	private UserRepository userRepository;
	
	@Mock
	private DelivarableRepository delivarableRepository;
	
	@Mock
	private CustomRepository customRepository;
	
	
	@Test
	public void saveDelivarable(){
		Delivarable delivarable = new Delivarable(1,1,"project","good",false,false);
		DelivarableModel del = new DelivarableModel(1,"project","good");
		when(delivarableRepository.save(delivarable)).thenReturn(delivarable);
		assertEquals(del.getEmployeeId(),delivarable.getEmployeeId());
	}

	

}
