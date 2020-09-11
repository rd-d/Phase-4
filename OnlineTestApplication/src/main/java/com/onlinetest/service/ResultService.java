package com.onlinetest.service;

import java.util.List;

import com.onlinetest.model.Results;

public interface ResultService {
	
	public Results createResult(Results results);
	public List<Results> getAllAnswers();
	public int getScore();

}
