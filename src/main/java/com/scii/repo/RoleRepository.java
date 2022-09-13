package com.scii.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scii.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
