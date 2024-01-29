package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
@Service
public interface EmployeeService {
	public Employee saverecords(Employee employee);
	public List<Employee> getall();
	public String deletebyid(int id);
	public boolean updaterecords(int id);
	

}
