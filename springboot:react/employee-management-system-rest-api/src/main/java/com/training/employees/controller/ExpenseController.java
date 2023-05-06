package com.training.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.employees.dto.ExpenseDTO;
import com.training.employees.service.EmployeeService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/expenses") // common mapping to all the methods
public class ExpenseController {

	
	@Autowired
	 @Qualifier("expenseServiceImp")
	private EmployeeService expense;
	
	@PostMapping("/add_expense")
	public ResponseEntity<ExpenseDTO> saveEmployee(@RequestBody ExpenseDTO expenseDTO) {
		expense.saveObj(expenseDTO);
		return new ResponseEntity<ExpenseDTO>(expenseDTO, HttpStatus.CREATED);
	}
	@GetMapping("/list-expenses")
	public List<? extends ExpenseDTO> listExpenses(){
		
		@SuppressWarnings("unchecked")
		List<? extends ExpenseDTO> exptdto = (List<? extends ExpenseDTO>) expense.findAll();
		
		return  (List<? extends ExpenseDTO>)exptdto;		
	}
}
