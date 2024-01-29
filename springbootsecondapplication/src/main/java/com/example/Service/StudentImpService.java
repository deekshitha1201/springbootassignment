package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Repository.StudentRepository;
@Service
public class StudentImpService implements StudentService {
	@Autowired
    private StudentRepository sr;
	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	

}
