package com.techbeast.kanban.emp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.techbeast.kanban.emp.service.models.Employee;
import com.techbeast.kanban.emp.service.resources.EmployeeRestResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private EmployeeRestResource employeeRestResource;
	
	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
	    assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/employee/api/hello",
		        String.class)).contains("Hello Spring Boot");
	  }
	
	@Test
	public void testGetEmployeeById() {
		Optional<Employee> employee = employeeRestResource.getEmployee(101);
		System.out.println("Searched Employee ID is present:-"+employee.isPresent());
		assertEquals(true, employee.isPresent());
	}
}
