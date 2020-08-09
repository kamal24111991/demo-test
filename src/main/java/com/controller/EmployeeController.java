package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.*;

@RestController
public class EmployeeController {
	
	@RequestMapping("/test")
	@GetMapping
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Nitish","Chandna","nitish@gmail.com"));
		return employeesList;
    }
	
	@RequestMapping("/data")
	@GetMapping
    public List<Employee> getEmployee() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Test","User","test@gmail.com"));
		return employeesList;
    }

}
