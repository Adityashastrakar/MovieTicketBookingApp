package com.movie.ticket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@Column
	private String name;

	@Column
	private String username;

	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column 
	private String role;
	
	public User(String name,String username,String password,String email,String role) {
		this.email=email;
		this.name=name;
		this.password=password;
		this.username=username;	
		this.role=role;
	}
	
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	
}
