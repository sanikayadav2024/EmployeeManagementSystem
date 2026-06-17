package com.sanika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
 
}
