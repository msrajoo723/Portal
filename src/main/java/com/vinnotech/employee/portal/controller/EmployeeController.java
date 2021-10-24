package com.vinnotech.employee.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinnotech.employee.portal.model.User;
import com.vinnotech.employee.portal.repository.UserRepository;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/{username}")
	public User showEmployee(@PathVariable("username") String username) {
		return userRepo.findByUsername(username);
	//	return User.builder().id(23l).username("raju").password("raju").build();
	}
}
