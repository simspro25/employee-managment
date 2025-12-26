package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.backend.model.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}
