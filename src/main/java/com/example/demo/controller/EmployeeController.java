package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	//getAllEmployees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	//create employee rest 
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody  Employee employee) {
		return employeeRepository.save(employee);
		}
	
	// get employee by id rest api
		@GetMapping("/employees/{id}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
			Employee employee = employeeRepository.findById(id).orElseThrow();
			return ResponseEntity.ok(employee);
		}
		@PutMapping("/employees/{id}")
		public ResponseEntity<Employee> updateEmployee(@PathVariable Long id , @RequestBody Employee employeeDetails){
			Employee employee = employeeRepository.findById(id).orElseThrow();
			
			employee.setName(employeeDetails.getName());
			employee.setEmailId(employeeDetails.getEmailId());
			employee.setAddress(employeeDetails.getAddress());
			employee.setGstNo(employeeDetails.getGstNo());
			employee.setPanNo(employeeDetails.getPanNo());
			employee.setCode(employeeDetails.getCode());
			employee.setPinCode(employeeDetails.getPinCode());
			employee.setCountry(employeeDetails.getCountry());
			employee.setState(employeeDetails.getState());
			employee.setCity(employeeDetails.getCity());
			employee.setMobileNo(employeeDetails.getMobileNo());
			employee.setLatitude(employeeDetails.getLatitude());
			employee.setLongitude(employeeDetails.getLongitude());
			employee.setCurrency(employeeDetails.getCurrency());
			employee.setCpdName(employeeDetails.getCpdName());
			employee.setCpdEmail(employeeDetails.getCpdEmail());
			employee.setCpdMobileNo(employeeDetails.getCpdMobileNo());
			employee.setCpdDesignation(employeeDetails.getCpdDesignation());
			employee.setCpdDesignation(employeeDetails.getCpdDepartment());
			
			Employee updatedEmployee = employeeRepository.save(employee);
			return ResponseEntity.ok(updatedEmployee);
		}
		
		

}
