package com.onlinetest.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetest.dao.OnlineTestDAO;
import com.onlinetest.dao.ResultsDAO;
import com.onlinetest.model.OnlineTest;
import com.onlinetest.model.Results;
import com.onlinetest.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{
	
	@Autowired
	private ResultsDAO dao;
	@Autowired
	private OnlineTestDAO daoo;

	@Override
	public Results createResult(Results results) {
		// TODO Auto-generated method stub
		return dao.save(results);
	}

	@Override
	public List<Results> getAllAnswers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public int getScore() {
		int score=0;
		int question_limit=0;
		List<OnlineTest> questions=daoo.findAll();
		question_limit=questions.size();
		
			for(int i=1;i<question_limit+1;i++) {
				
					try {
						OnlineTest question=daoo.findById(i).get();
						Results answer=dao.findById(i).get();
						if((question.getCorrectanswer().toString()).equals(answer.getUseranswer().toString())) {
							score=score+1;
						}
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("User has not submitted any answer");
					}
			} 
		return score;
	}

}
