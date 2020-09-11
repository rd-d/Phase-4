package com.onlinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetest.model.OnlineTest;
import com.onlinetest.service.OnlineTestService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OnlineTestController {
	
	@Autowired
	private OnlineTestService service;

	@GetMapping("/values")
	public List<OnlineTest> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

}
