package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Service.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService us;
	@PostMapping("/saveuser")
    public ResponseEntity<String> register(@RequestBody User user) {
       return new ResponseEntity<String>(us.saveuser(user),HttpStatus.ACCEPTED);
    }
	@PostMapping("login")
	public ResponseEntity<String> loginAccount(@RequestBody Map<String, String> request)
	   {
		   String email=request.get("email");
		   String password=request.get("password");
		return new ResponseEntity<String>(us.Login(email, password),HttpStatus.ACCEPTED);
	   }

}
