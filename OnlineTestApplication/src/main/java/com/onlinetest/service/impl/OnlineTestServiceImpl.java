package com.onlinetest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetest.dao.OnlineTestDAO;
import com.onlinetest.model.OnlineTest;
import com.onlinetest.model.Results;
import com.onlinetest.service.OnlineTestService;

@Service
public class OnlineTestServiceImpl implements OnlineTestService{
	
	@Autowired
	private OnlineTestDAO dao;

	@Override
	public List<OnlineTest> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}

	