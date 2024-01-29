package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Entity.User;

@Service
public interface UserService {
	String saveuser(User user);
	String Login(String email,String pass);

}
