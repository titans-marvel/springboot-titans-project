package com.briz.springboot_titans_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {
	@Autowired
	ERepository ERepository;
	
	@RequestMapping("/save")
	public String addEmployee(@RequestBody Employee employee) {
		ERepository.save(employee);
		return "Employee added successfully";
	}

}
