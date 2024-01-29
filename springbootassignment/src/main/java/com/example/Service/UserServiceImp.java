package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;


@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository ur;

	@Override
	public String saveuser(User user) {
		User u=new User();
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setEmail(user.getEmail());
		ur.save(u);
		return "successfully saved";
	}

	@Override
	public String Login(String email, String password) {
		if(ur.existsByEmail(email))
		{
			User c=ur.findByEmail(email);
			String p=c.getPassword();
			if(p.equalsIgnoreCase(password))
			{
				return "email already register";
			}
			return "invalid email or password";
		}
		return "invalid email ";
	}

}
