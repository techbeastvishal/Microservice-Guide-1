package com.techbeast.kanban.emp.service.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techbeast.kanban.emp.service.exception.EmployeeNotFoundException;
import com.techbeast.kanban.emp.service.models.Employee;
import com.techbeast.kanban.emp.service.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee/api")
public class EmployeeRestResource {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/{empId}")
	public Optional<Employee> getEmployee(@PathVariable long empId) {
		Optional<Employee> employeeList = employeeRepository.findById(empId);
		
		if(!employeeList.isPresent())
			throw new EmployeeNotFoundException("Employee Which is Not Found has Id-:"+empId);
		
		return employeeRepository.findById(empId);
	}
	
	@RequestMapping("/hello")
	public String testHello() {
		return "Hello Spring Boot";
	}
	
}
