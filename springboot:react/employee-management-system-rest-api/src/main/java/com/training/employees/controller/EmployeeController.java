package com.training.employees.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.employees.dto.EmployeeDTO;
import com.training.employees.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees") // common mapping to all the methods
public class EmployeeController {

	@Autowired
	 @Qualifier("employeeServiceImpl")
	private EmployeeService service;

	@PostMapping("/add_employee")
	public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		service.saveObj(employeeDTO);
		return new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable int id) {
//		EmployeeDTO Object = null;
//		EmployeeDTO dto = (EmployeeDTO) Object;
		
		Object obj = service.getById(id);
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(obj, dto);
		
		return new ResponseEntity<EmployeeDTO>(dto, HttpStatus.FOUND);
	}
	@GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
      return new ResponseEntity<>("Welcome to Strings , this is a plain text",HttpStatus.OK);
    }
	
	@GetMapping("/list-employee")
	public ResponseEntity<List<? extends EmployeeDTO>> listEmployee(){
		
//		List<?> emplist = service.findAll();
		@SuppressWarnings("unchecked")
		List<? extends EmployeeDTO> emplistdto = (List<? extends EmployeeDTO>) service.findAll();
		
		return new ResponseEntity<List<? extends EmployeeDTO>>(emplistdto, HttpStatus.FOUND);
		
		
	}
}
