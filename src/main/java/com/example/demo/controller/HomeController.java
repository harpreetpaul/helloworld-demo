package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class HomeController {
	@RequestMapping(value = "/resource/{id}",
	 produces = { "application/json" }, 
     
     method = RequestMethod.GET)
	public ResponseEntity <String> getApi(@PathVariable("id") String id) {		
		return new ResponseEntity<String>("{\r\n" + 
				"  \"message\":\"Spring Demo\",\r\n" + 
				"  \"status\":\"OK\"\r\n" + 
				"}",HttpStatus.OK) {};
		
	}

}
