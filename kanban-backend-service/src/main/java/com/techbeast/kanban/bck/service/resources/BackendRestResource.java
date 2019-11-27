package com.techbeast.kanban.bck.service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techbeast.kanban.bck.service.exception.TaskNotFoundException;
import com.techbeast.kanban.bck.service.models.Task;
import com.techbeast.kanban.bck.service.repo.TaskRepository;

@RestController
@RequestMapping("/kanban/api")
public class BackendRestResource {

	@Autowired
	private TaskRepository taskRepository;
	
	// GET LIST OF TASKS BASED ON EMPLOYEE ID..
	@RequestMapping("/{empId}")
	public List<Task> getKanbanListByEmpId(@PathVariable long empId) {
		List<Task> taskList = taskRepository.findByEmpId(empId);
		
		if(taskList.size()<=0)
			throw new TaskNotFoundException("No Task Found for the Employee Id-:"+empId);
		
		return taskList;
	}
}
