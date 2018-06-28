package com.how.exam.test.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	
	private static final Logger logger = LoggerFactory.getLogger(TestDao.class);
	
	@Autowired
	SqlSession sqlsession;
	
	public String test() {
		return sqlsession.selectOne("test.hello");
	}
	
	public List<Object> empList() {
		return sqlsession.selectList("test.empList");
	}
	
}
