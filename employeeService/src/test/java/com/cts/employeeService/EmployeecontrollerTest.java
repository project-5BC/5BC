package com.cts.employeeService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import com.cts.employeeService.controller.EmployeeController;
import com.cts.employeeService.entityClass.Delivarable;
import com.cts.employeeService.repository.UserRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class EmployeecontrollerTest {

	@InjectMocks
	private EmployeeController employeeController;
	
	@Mock
	private UserRepository userRepository;
	
	@Test
	public void testHello() {
	EmployeeController employee = new EmployeeController();
	String result = employee.home();
	assertEquals(result,"welcome to employee management");
	
	}
	
	@Test
	public void getDelivarablesByEmployeeIdTest() {
		ResponseEntity<List<Delivarable>> data = this.employeeController.getDelivarablesByEmployeeId(1);
		assertEquals(HttpStatus.SC_OK, data.getStatusCode());
	}
}
