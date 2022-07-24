package com.dico.ems.services;

import com.dico.ems.models.Department;
import com.dico.ems.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentByID(Integer id) {
        return (Department) departmentRepository.findById(id).orElse(null);
    }
    public Department addDepartment(Department department) {
        return  departmentRepository.save(department);
    }
    public List<Department> addMultipleDepartment(List<Department> department) {
        return departmentRepository.saveAll(department);
    }
    public Department  updateDepartment(Department department, Integer id) {
        Department getExistingDepartment = departmentRepository.getReferenceById(id);
        if(getExistingDepartment != null) {
            getExistingDepartment.setDepartmentName(department.getDepartmentName());
          return   departmentRepository.save(getExistingDepartment);
        }
        return  department;
    }

    public boolean deleteDepartment(Integer id) {
        Department getExistingDepartment = departmentRepository.getReferenceById(id);
        if (getExistingDepartment != null){
            departmentRepository.deleteById(id);
            return  true;
        }

        return false;
    }
}
