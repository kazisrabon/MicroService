package com.kazi.user.controller;

import com.kazi.user.entity.User;
import com.kazi.user.service.UserService;
import com.kazi.user.valueobject.DepartmentResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("User controller -> saveUser method");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public DepartmentResponseVO getUserAndDepartmentById(@PathVariable("id") Long userId){
        log.info("User controller -> getUserById method");
        return userService.getUserAndDepartmentById(userId);
    }


}
