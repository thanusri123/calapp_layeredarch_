package com.example.demo;


import org.springframework.data.repository.CrudRepository;
 
import org.springframework.stereotype.Repository;
import com.example.demo.Employee;
 
@Repository
 
public interface EmployeeRepositiry extends CrudRepository<Employee, Long> {
 
}