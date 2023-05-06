package com.training.employees.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.employees.dto.EmployeeDTO;
import com.training.employees.entity.Employee;
import com.training.employees.repository.EmployeeRepository;
import com.training.employees.service.EmployeeService;

@Service
@Component("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Object saveObj(Object obj) {
		// Convert the DTO into the Entity Object
		Employee employee = new Employee(); // Emplty Enity class object
		// Copy DTO into entity object
		BeanUtils.copyProperties(obj, employee);
		repository.save(employee);
		return obj;
	}

	@Override
	public Object updateEmployee(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deactivateEmployee(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getById(int id) {
		EmployeeDTO Object = null;
		EmployeeDTO dto = (EmployeeDTO) Object;
		
		Optional<Employee> employee = repository.findById(id);
		if (employee.isPresent()) {
			// Convert the Entity into the DTO Object
			dto = new EmployeeDTO();
			BeanUtils.copyProperties(employee.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<? extends Employee> findAll() {
		
//		List list = new List();
		List<? extends Employee> list = (List<? extends Employee>) repository.findAll();
		
		
//		Iterable<Employee> iterable = repository.findAll();
//		iterable.forEach(list::add);
		
		return list;
	}

}
