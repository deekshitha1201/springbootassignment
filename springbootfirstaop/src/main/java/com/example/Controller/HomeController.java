package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Repository.Studentrepo;


@RestController
public class HomeController {
	@Autowired
	private Studentrepo sr;
	@GetMapping("/a")
	public String access() {
		return "welcome";
	}
	@GetMapping("/a1")
	public Student access2()
	{
		return new Student(1,"deekshu","patruni");
	}
	@PostMapping("/savedata")
	public Student savedata(@RequestBody Student s)
	{
		return s;
		
	}
	@GetMapping("/{id}")
	public Student getusingid(@PathVariable int id)
	{
		return sr.finById(id);
		
	}
	

}
