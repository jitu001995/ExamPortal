package com.scii.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scii.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
   
	public User findByUsername(String username);
}
