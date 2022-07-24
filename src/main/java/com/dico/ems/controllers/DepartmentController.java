package com.dico.ems.controllers;

import com.dico.ems.models.Department;
import com.dico.ems.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    //Get All Departments
    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    //Add a Single Department
    @PostMapping("/addDepartment")
    public Department AddDepartment(@RequestBody  Department department){
        return departmentService.addDepartment(department);
    }

    //Return A single Department
    @GetMapping("/getDepartmentByID/{id}")
    public Department getDepartmentByID(@PathVariable Integer id){
        return departmentService.getDepartmentByID(id);
    }
    //Add a Multiple Department
    @PostMapping("/addMultipleDepartment")
    public List <Department> AddMultipleDepartment(@RequestBody List<Department> department){
        return departmentService.addMultipleDepartment(department);
    }
    //Update Department
    @PutMapping("/updateDepartment/{id}")
    public Department updateDepartment(@PathVariable Integer id, @RequestBody Department department){
        return departmentService.updateDepartment(department,id);
    }
    //Delete Department
    @DeleteMapping("/deleteDepartment/{id}")
    public boolean deleteDepartment(@PathVariable Integer id){
        return departmentService.deleteDepartment(id);
    }

}
