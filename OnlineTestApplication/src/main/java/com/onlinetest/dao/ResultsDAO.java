package com.onlinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinetest.model.Results;

@Repository
public interface ResultsDAO extends JpaRepository<Results, Integer>{

}
