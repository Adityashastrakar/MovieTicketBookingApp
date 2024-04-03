package com.movie.ticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.entities.User;
import com.movie.ticket.services.Userservice;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class Usercontroller {
	
	@Autowired
	Userservice uservice;
	
	@PostMapping("/signup")
	public User signup(@RequestBody User u)
	{
		return uservice.Signup(u);	
	}
	
	@PostMapping("/signin")
	public String signin(@RequestBody User u)
	{
		return uservice.Signin(u.getUsername(), u.getPassword());
	}

}
