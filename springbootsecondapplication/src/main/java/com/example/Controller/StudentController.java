package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentImpService;
@RestController
public class StudentController {
	@Autowired
	private StudentImpService stimp;
	@PostMapping("/savedata")
	public Student create(@RequestBody Student student)
	{
		return stimp.save(student);
	}

}
