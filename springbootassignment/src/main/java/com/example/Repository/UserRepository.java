package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	//User  findByEmail(String email);
	boolean existsByEmail(String email);
	User findByEmail(String email);

}
