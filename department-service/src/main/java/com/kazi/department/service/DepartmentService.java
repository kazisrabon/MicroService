package com.kazi.department.service;

import com.kazi.department.entity.Department;
import com.kazi.department.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDept(Department department) {
        log.info("Department service -> saveDept method");
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Department service -> findDepartmentById method");
        return departmentRepo.findById(departmentId).orElse(null);
    }
}
