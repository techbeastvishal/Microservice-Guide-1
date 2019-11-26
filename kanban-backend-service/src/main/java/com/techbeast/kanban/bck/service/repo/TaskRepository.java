package com.techbeast.kanban.bck.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techbeast.kanban.bck.service.models.Task;


public interface TaskRepository extends JpaRepository<Task, Long>{

	//Find By Employee Id...
	List<Task> findByEmpId(long empId);
	
	// @Query("SELECT t.TASK_ID,t.TASK_DESCRIPTION,t.TASK_STATUS,t.TASK_SUBJECT_LINE FROM KANBAN_MODEL t WHERE t.EMP_ID = :empId") 
	 //Optional<KanbanModel> findTaskByEmpId(@Param("empId") Long empId);
}
