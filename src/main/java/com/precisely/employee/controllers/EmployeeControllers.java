package com.precisely.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.precisely.employee.entites.Employee;
import com.precisely.employee.repository.EmployeeRepository;


@RestController
public class EmployeeControllers {

	@Autowired
	EmployeeRepository repository;
	
	
	@RequestMapping(value="/employees/",method=RequestMethod.GET)
	public List<Employee> getEmployee(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id")int id) {
		return repository.findById(id).get();
	}
	
	
	@RequestMapping(value="/employees/",method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@RequestMapping(value="/employees/",method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id")int id) {
		   repository.deleteById(id);
		}
	
}
