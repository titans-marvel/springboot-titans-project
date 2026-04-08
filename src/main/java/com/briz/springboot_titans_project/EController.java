package com.briz.springboot_titans_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {
 
@RequestMapping("/Mukesh")
public String getMukesh() {
	return "Hello Mukesh";
}
}