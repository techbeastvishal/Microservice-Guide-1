package com.techbeast.kanban.dsh.service.models;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private long empId;
	private List<Task> tasks;
	
	public TaskList() {
		tasks = new ArrayList<>();
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public TaskList(List<Task> tasks) {
		super();
		this.tasks = tasks;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	
}
