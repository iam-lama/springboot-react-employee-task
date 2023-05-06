package com.training.employees.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.employees.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
