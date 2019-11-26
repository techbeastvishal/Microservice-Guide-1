package com.techbeast.kanban.dsh.service.models;

public class Dashboard {

	private long empId;
	private String empName;
	private String empDept;
	private String empBand;
	
	private long taskId;
	private String taskSubjectLine;
	private String taskDescription;
	private int taskStatus;
	
	public Dashboard() {
		// TODO Auto-generated constructor stub
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpBand() {
		return empBand;
	}

	public void setEmpBand(String empBand) {
		this.empBand = empBand;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
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

	public Dashboard(long empId, String empName, String empDept, String empBand, long taskId, String taskSubjectLine,
			String taskDescription, int taskStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBand = empBand;
		this.taskId = taskId;
		this.taskSubjectLine = taskSubjectLine;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
	}
	
	
}
