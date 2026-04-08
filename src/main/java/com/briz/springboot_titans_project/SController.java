package com.briz.springboot_titans_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SController {

	@RequestMapping("/sathy")
	public String getsatyarth() 
  {
		return "End point created by satyarth!";
  }
	
}
