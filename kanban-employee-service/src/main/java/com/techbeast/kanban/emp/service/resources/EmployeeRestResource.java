package com.techbeast.kanban.emp.service.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techbeast.kanban.emp.service.models.Employee;
import com.techbeast.kanban.emp.service.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee/api")
public class EmployeeRestResource {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/{empId}")
	public Optional<Employee> getEmployee(@PathVariable long empId) {
		return employeeRepository.findById(empId);
	}
	
}
