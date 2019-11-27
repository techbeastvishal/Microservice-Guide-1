package com.techbeast.kanban.bck.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.techbeast.kanban.bck.service.models.Task;
import com.techbeast.kanban.bck.service.resources.BackendRestResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private BackendRestResource backendRestResource;
	
	
	@Test
	public void testGetEmployeeById() {
		List<Task> task = backendRestResource.getKanbanListByEmpId(101);
		System.out.println("Searched Employee ID is present:-"+task.get(0).getEmpId());
		
		assertEquals(101, task.get(0).getEmpId());
	}
}
