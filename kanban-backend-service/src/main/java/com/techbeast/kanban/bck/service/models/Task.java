package com.techbeast.kanban.bck.service.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private long taskId;
	private long empId;
	private String taskSubjectLine;
	private String taskDescription;
	private int taskStatus;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getTaskSubjectLine() {
		return taskSubjectLine;
	}
	public void setTaskSubjectLine(String taskSubjectLine) {
		this.taskSubjectLine = taskSubjectLine;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	
}
