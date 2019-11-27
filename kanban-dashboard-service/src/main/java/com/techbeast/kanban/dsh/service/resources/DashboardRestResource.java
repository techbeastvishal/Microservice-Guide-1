package com.techbeast.kanban.dsh.service.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.techbeast.kanban.dsh.service.exception.EmployeeNotFoundException;
import com.techbeast.kanban.dsh.service.models.Employee;

@RestController
@RequestMapping("/dashboard/api")
public class DashboardRestResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{empId}")
	public List<Object> getDashboardData(@PathVariable long empId){
		Employee employee = restTemplate.getForObject("http://localhost:8082/employee/api/"+empId, Employee.class);
		
		if(employee.getEmpName().isEmpty())
			throw new EmployeeNotFoundException("Employee which is not present in Db Id is-:"+empId);
			
			ResponseEntity<Object[]> response = restTemplate.getForEntity("http://localhost:8083/kanban/api/"+empId, Object[].class);
			
			System.out.println("-->"+response.getStatusCode().toString());
			
			return Arrays.asList(response.getBody());
	}
}
