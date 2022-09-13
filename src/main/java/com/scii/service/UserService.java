package com.scii.service;

import java.util.Set;

import com.scii.model.User;
import com.scii.model.UserRole;

public interface UserService {
   
	//creating useer
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	//get user by username
	public User getUser(String username);
	
	//delete user by id
	public void deleteUser(Long userid);
}
