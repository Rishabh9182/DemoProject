package com.user_service.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user_service.user.entity.User;
import com.user_service.user.entity.UserEnroll;
import com.user_service.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/userenroll")
	public List<UserEnroll> getAllUserEnroll(){
		return userService.getAllUserEnroll();
	}
	
	@GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
    return userService.getUser(userId);
    }
	
	@PostMapping("")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
		}
	
	@PostMapping("/userenroll")
	public UserEnroll addUserEnroll(@RequestBody UserEnroll userEnroll) {
		return userService.addUserEnroll(userEnroll);
		}
	
	@PutMapping("")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/course/{courseId}")
	public UserEnroll getUserByCourseId(@PathVariable Long courseId){
		String url = "http://localhost:8081/course/" + courseId;
	    ResponseEntity<UserEnroll> response = restTemplate.getForEntity(url, UserEnroll.class);
	    return response.getBody();
	}
		
	
	
	}

	




