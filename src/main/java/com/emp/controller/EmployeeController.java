package com.emp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.Employee;
import com.emp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@Autowired
	RestTemplate restTemplete;
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		Employee employee = this.employeeService .getEmployee(eId);
		
		List records = this.restTemplete.getForObject("http://localhost:8084/record/emp/" + eId,List.class);
		
		employee.setRecords(records);
		
		return employee;
	}

}
