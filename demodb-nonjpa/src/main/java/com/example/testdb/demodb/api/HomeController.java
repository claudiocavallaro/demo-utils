package com.example.testdb.demodb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testdb.demodb.model.User;
import com.example.testdb.demodb.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	@ResponseBody
	public String home() {
		return "HOME CONTROLLER";
	}

	@GetMapping("/findall")
	public String findAll() {
		return userService.findAll();
	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return userService.insert(user);
	}

}
