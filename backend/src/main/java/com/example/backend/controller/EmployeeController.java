package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Employee;
import com.example.backend.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/vi")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getEmployee();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		 return employeeService.saveEmployee(employee);
	}
	
	@PostMapping("/addemployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employee) {
		 return employeeService.saveEmployees(employee);
	}
	
	@GetMapping("/employees/{id}")
	public Employee findEmployeeById(@PathVariable long id) {
		return employeeService.getEmployeeById(id);		
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
	    employee.setId(id);
	    return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable long id) {
		return employeeService.deleteEmployee(id);
	}
	

}
