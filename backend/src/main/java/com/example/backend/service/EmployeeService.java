package com.example.backend.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backend.model.Employee;
import com.example.backend.repository.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);	 
	 }
	
	public List<Employee> saveEmployees(List<Employee> employee) {
		 return employeeRepository.saveAll(employee);	 
	 }
	public List<Employee> getEmployee(){
		 return employeeRepository.findAll();	 
	 }
	public Employee getEmployeeById(long id) {
		 return employeeRepository.findById(id).orElse(null);	 
	 }
	
    public String deleteEmployee(long id) {
    	employeeRepository.deleteById(id);
    	return "employee removed !!" + id;
    }
    
    public Employee updateEmployee(Employee employee) {
   	 Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
   	existingEmployee.setFirstName(employee.getFirstName());
   	existingEmployee.setLastName(employee.getLastName());
   	existingEmployee.setEmail(employee.getEmail());
   	 
   	 return employeeRepository.save(existingEmployee);
    
    }
}

