package com.training.employees.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.employees.dto.ExpenseDTO;
import com.training.employees.entity.Expense;
import com.training.employees.repository.ExpenseRepository;
import com.training.employees.service.EmployeeService;

@Service
@Component("expenseServiceImp")
public class ExpenseServiceImp implements EmployeeService {

	@Autowired
	private ExpenseRepository exrepository; 
	
	@Override
	public Object saveObj(Object obj) {
		Expense exp = new Expense(); // Emplty Enity class object
		// Copy DTO into entity object
		BeanUtils.copyProperties(obj, exp);
		exrepository.save(exp);
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
		ExpenseDTO Object = null;
		ExpenseDTO dto = (ExpenseDTO) Object;
		
		Optional<Expense> expense = exrepository.findById(id);
		if (expense.isPresent()) {
			// Convert the Entity into the DTO Object
			dto = new ExpenseDTO();
			BeanUtils.copyProperties(expense.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<? extends Expense> findAll() {
		
		List<? extends Expense> list = (List<? extends Expense>) exrepository.findAll();

		return list;
	}

}
