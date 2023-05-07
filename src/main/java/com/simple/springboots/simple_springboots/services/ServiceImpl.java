package com.simple.springboots.simple_springboots.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class ServiceImpl {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from java simple springboots app!";
	}
	
	@GetMapping("/getName")
	@ResponseBody
	public ResponseEntity<Object> getName(
			@RequestParam("name") String name) throws JsonProcessingException {
		
		String responseBody = "Hello " + name;
		HttpStatus httpStatus = HttpStatus.OK;

		return new ResponseEntity(responseBody, httpStatus);
	}

}
