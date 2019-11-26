package com.techbeast.kanban.emp.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techbeast.kanban.emp.service.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
