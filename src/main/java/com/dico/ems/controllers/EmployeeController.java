package com.dico.ems.controllers;

import com.dico.ems.models.Employee;
import com.dico.ems.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// add New Employee
	@PostMapping("/addOne")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	// add more than one Employee
	@PostMapping("/addMany")
	public List<Employee> addAllEmployee(@RequestBody List<Employee> employees) {
		return employeeService.addAllEmployees(employees);
	}



	// Get employee by Id
	@GetMapping("/getByID/{id}")
	public Employee getEmployeeByID(@PathVariable int id) {
		return employeeService.getEmployeeByID(id);
	}
	// Get All employee
	@GetMapping("/getAll")
	public List <Employee> getAll() {
		return employeeService.getAllEmployee();
	}

	// Get employee by Name
	@GetMapping("/getByName/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	
	//Update Employee
	@PutMapping("/updateEmploye/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
		return employeeService.updateEmployee(employee,id);
	}
	
	
	// Delete Employee
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployeeByID(@PathVariable int id) {
		return employeeService.deleteEmployeeByID(id);
	}

}
