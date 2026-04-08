package com.briz.springboot_titans_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {
 
@RequestMapping("/Mukesh")
public String getMukesh() {
	return "Hello Mukesh";
}
}
	@Autowired
	ERepository ERepository;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/save")
	public String addEmployee(@RequestBody Employee employee) {
		ERepository.save(employee);
		return "Employee added successfully";
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return ERepository.findAll();
	}

}
