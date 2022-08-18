package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	List<Employee> list = List.of(
		new Employee(123L,"Surya","998977889"),	
		new Employee(124L,"Siva","998977887"),
		new Employee(125L,"Varma","998977883"),
		new Employee(126L,"Satya","998977882"),
		new Employee(127L,"Vikram","998977880"));

	@Override
	public Employee getEmployee(Long id) {
		
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
