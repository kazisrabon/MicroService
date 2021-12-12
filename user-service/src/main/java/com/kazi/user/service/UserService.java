package com.kazi.user.service;

import com.kazi.user.entity.User;
import com.kazi.user.repository.UserRepository;
import com.kazi.user.valueobject.Department;
import com.kazi.user.valueobject.DepartmentResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("User service -> saveUser method");
        return userRepository.save(user);
    }

    public DepartmentResponseVO getUserAndDepartmentById(Long userId) {
        log.info("User service -> getUserAndDepartmentById method");
        DepartmentResponseVO vo = new DepartmentResponseVO();
        User user = userRepository.getUserByUserId(userId);
        Department department =
                restTemplate.getForObject(
                        "http://localhost:9001/departments/" + user.getDepartmentId(),
                        Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
