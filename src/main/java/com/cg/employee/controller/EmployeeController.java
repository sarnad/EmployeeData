package com.cg.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.model.Employee;
import com.cg.employee.repository.EmployeeRepository;

/*
 * This is the API for getting the list of employee with pagination
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	Page<Employee> getAllEmployee(Pageable pageable) {
		return empRepo.findAll(pageable);
	}
}
