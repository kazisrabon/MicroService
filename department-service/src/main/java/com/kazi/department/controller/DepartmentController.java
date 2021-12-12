package com.kazi.department.controller;

import com.kazi.department.entity.Department;
import com.kazi.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Department controller -> saveDepartment method");
        return departmentService.saveDept(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Department controller -> findDepartmentById method");
        return departmentService.findDepartmentById(departmentId);
    }
}
