package com.training.employees.service;

import java.util.List;

//import com.training.employees.dto.EmployeeDTO;

public interface EmployeeService {

	public Object saveObj(Object obj);

	public Object updateEmployee(Object obj);

	public Object deactivateEmployee(Object obj);

	public Object getById(int id);

	public List<?> findAll();

}
