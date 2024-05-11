package com.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pet.bean.User;
import com.pet.repository.UserDAO;
import com.pet.repository.UserDAOImpl;

@RestController
@CrossOrigin("*")
public class UserController extends UserDAOImpl {

	@Autowired
	UserDAO userdao;

	// to insert the data
	@PostMapping("/doUserInsert")
	public User insertUser(@RequestBody User newUser) {
		return userdao.newUser(newUser);

	}

	// to get all the data from the database
	@GetMapping("/getAllUserList")
	public List<User> getUsers() {
		return userdao.getAllUsers();
	}

	// get by id
	@GetMapping("/GetUserId/{userId}")
	public User findUser(@PathVariable("userId") int userId) {
		return userdao.doCourseFind(userId);
	}

	// to get all the Id
	@GetMapping("/getUserIdList")
	public List<Integer> allUsers() {
		return userdao.getUserbylist();
	}

}
