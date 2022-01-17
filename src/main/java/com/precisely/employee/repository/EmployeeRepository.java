package com.precisely.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.precisely.employee.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	 
}
