package com.example.RESTfulGradleProject1.usercontroller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userDao.getAllUsers();
	}
}
