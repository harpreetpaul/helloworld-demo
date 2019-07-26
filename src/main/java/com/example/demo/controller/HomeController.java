package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HomeController {
	@RequestMapping(produces = { "application/json" },method = RequestMethod.GET)
	public ResponseEntity<String> getApi(@RequestHeader Map<String, String> headers) {
		StringBuilder headersAsString=new StringBuilder();
		headers.forEach((key, value) -> {
			headersAsString.append(key+"="+value+"\r\n");
	       
	    });
		
		return new ResponseEntity<String>("{\r\n" + 
				"	\"message\": \"Spring Demo\",\r\n" + 
				"	\"status\": \"OK\",\r\n" + 
				"	\"headers\":"+headersAsString.toString()+"\r\n" + 
				"}"
				, HttpStatus.OK) {
		};
	}
}
