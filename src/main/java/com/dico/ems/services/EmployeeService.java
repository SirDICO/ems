package com.dico.ems.services;

import com.dico.ems.models.Employee;
import com.dico.ems.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {
        return  employeeRepository.save(employee);
    }

    public List<Employee> addAllEmployees(List<Employee> employees) {
        return  employeeRepository.saveAll(employees);
    }

    public Employee getEmployeeByID(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public boolean deleteEmployeeByID(int id) {
        Employee existingEmployee = employeeRepository.getReferenceById(id);
        if (existingEmployee != null){
            employeeRepository.deleteById(id);
            return  true;
        }

        return  false;
    }

	public Employee updateEmployee(Employee employee, Integer id) {
		// TODO Auto-generated method stub
		Employee existingEmployee = employeeRepository.getReferenceById(id);
		if(existingEmployee != null) {
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setFirstname(employee.getFirstname());
            existingEmployee.setLastname(employee.getLastname());
            existingEmployee.setMiddlename(employee.getMiddlename());
            existingEmployee.setGender(employee.getGender());
            existingEmployee.setAppointment_id(employee.getAppointment_id());
            existingEmployee.setDob(employee.getDob());
            existingEmployee.setEmployeetype_id(employee.getEmployeetype_id());
            existingEmployee.setDepartmentId(employee.getDepartmentId());
            existingEmployee.setNok_id(employee.getNok_id());
            existingEmployee.setInitials(employee.getInitials());
            existingEmployee.setMaritalStatus(employee.getMaritalStatus());
            existingEmployee.setPassport(employee.getPassport());
            existingEmployee.setPhone(employee.getPhone());
            existingEmployee.setPhoto(employee.getPhoto());
            existingEmployee.setFileNumber(employee.getFileNumber());
            existingEmployee.setResidentialAddress(employee.getResidentialAddress());
            existingEmployee.setTitle(employee.getTitle());
            existingEmployee.setStateOrigin(employee.getStateOrigin());
            existingEmployee.setSalarystructure_id(employee.getSalarystructure_id());
		  return employeeRepository.save(existingEmployee);

		}
        return  employee;
	}

    public List <Employee> getAllEmployee() {
        return  employeeRepository.findAll();
    }
}
