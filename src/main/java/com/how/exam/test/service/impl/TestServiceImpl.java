package com.how.exam.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.how.exam.test.dao.TestDao;

@Service
public class TestServiceImpl implements TestService{

	private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	
	@Resource
	private TestDao testDao;
	
	@Resource
	private TestService testService;
	
	@Override
	public void test() {
		String test = testDao.test();
		logger.info("값::"+test);
		
	}

	@Override
	public List<Object> empList() {
		return testDao.empList();
	}

}
