package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;
import com.example.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> creatrecords(@RequestBody Employee employee){
		Employee save=employeeService.saverecords(employee);
		return new ResponseEntity<Employee>(save,HttpStatus.CREATED);
	}
	@GetMapping("/gettingempdetails")
	public ResponseEntity<List<Employee>> getrecords(){
		List<Employee> e=employeeService.getall();
		return new ResponseEntity<List<Employee>>(e,HttpStatus.OK);
		
	}
	@DeleteMapping("/{id}")
	public String deleterecord(@PathVariable int id)
    {
		return employeeService.deletebyid(id);
    	
    }
	@PutMapping("{id}")
	public ResponseEntity<Employee> update(@RequestBody Employee employee,@PathVariable int id){
		if(!employeeService.updaterecords(id))
		{
			return ResponseEntity.notFound().build();
		}
		employee.setId(id);
		Employee updatedemployee=employeeService.saverecords(employee);
		return ResponseEntity.ok(updatedemployee);
		
		
		
		
	}
	

}
