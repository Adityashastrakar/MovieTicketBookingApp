package com.movie.ticket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.entities.User;
import com.movie.ticket.repositories.Usersrepository;

@Service
public class Userservice {

	@Autowired
	Usersrepository urepo;
	
	public User Signup(User u)
	{
		return urepo.save(u);
	}
	
	public String Signin(String username, String password)
	{
		
		User u=urepo.findByUsernameAndPassword(username, password);
		return u.getRole();
		
	}
	
}
