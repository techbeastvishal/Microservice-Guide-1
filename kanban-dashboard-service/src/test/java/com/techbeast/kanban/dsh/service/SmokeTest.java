package com.techbeast.kanban.dsh.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.techbeast.kanban.dsh.service.resources.DashboardRestResource;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SmokeTest {

	@Autowired
	private DashboardRestResource dashboardRestResource;
	
	 @Test
	  public void contexLoads() throws Exception {
	    assertThat(dashboardRestResource).isNotNull();
	  }
}
