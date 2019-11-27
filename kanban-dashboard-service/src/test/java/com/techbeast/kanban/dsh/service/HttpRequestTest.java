package com.techbeast.kanban.dsh.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.techbeast.kanban.dsh.service.resources.DashboardRestResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private DashboardRestResource dashboardRestResource;
	
	
	@Test
	public void testGetEmployeeById() {
		ResponseEntity<Object[]> response = (ResponseEntity<Object[]>) dashboardRestResource.getDashboardData(101);
		
		assertEquals(200, response.getStatusCodeValue());
	}
}
