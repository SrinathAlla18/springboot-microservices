package com.srinath.user.controller;

import com.srinath.user.VO.ResponseTemplateVO;
import com.srinath.user.entity.User;
import com.srinath.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);

    }
    @GetMapping("/firstName/{firstName}")
    public List<User> getUserWithFirstName(@PathVariable("firstName") String firstName){
        log.info("Inside getUserWithFirstName of UserController");
        return userService.getUserWithFirstName(firstName);
    }



}
