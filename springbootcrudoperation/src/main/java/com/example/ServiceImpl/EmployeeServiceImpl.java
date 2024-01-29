package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.EmployeeRepository;
import com.example.Service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saverecords(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		if(employeeRepository.existsById(id))
		{
			employeeRepository.deleteById(id);
		}
		return "deleted";
	}

	public boolean updaterecords(int id) {
		// TODO Auto-generated method stub
		
		return employeeRepository.existsById(id);
	}
	


	
	

}
