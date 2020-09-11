package com.onlinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetest.dao.OnlineTestDAO;
import com.onlinetest.dao.ResultsDAO;
import com.onlinetest.model.OnlineTest;
import com.onlinetest.model.Results;
import com.onlinetest.service.OnlineTestService;
import com.onlinetest.service.ResultService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResultController {

	@Autowired
	private ResultService service;

	@PostMapping("/results")
	public Results createResult(@RequestBody Results results) {
		// TODO Auto-generated method stub
		return service.createResult(results);
	}

	@GetMapping("/entered")
	public List<Results> getAllAnswers() {
		// TODO Auto-generated method stub
		return service.getAllAnswers();
	}

	@GetMapping("/score")
	public int getScore() {
		// TODO Auto-generated method stub
		return service.getScore();
	}
}

