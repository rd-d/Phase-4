package com.onlinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinetest.model.OnlineTest;

@Repository
public interface OnlineTestDAO extends JpaRepository<OnlineTest, Integer>{

}
