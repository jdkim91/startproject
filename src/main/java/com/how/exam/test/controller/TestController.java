package com.how.exam.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how.exam.test.service.impl.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	private static final Logger TELOG = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test")
	public String test(Model model, HttpServletRequest request) {
		
		if ( TELOG.isDebugEnabled() ) {
			TELOG.info("======================/TEST CONTROLLOER=====================");
		}
		TELOG.info("["+ request.getRequestURI()+"] <");
		
		testService.test();
		
		
		return "test/test";
	}
	
	@RequestMapping(value = "/empList")
	public String empList(Model model, HttpServletRequest request) {
		
		
		if ( TELOG.isDebugEnabled() ) {
			TELOG.info("======================/EMPLIST CONTROLLOER=====================");
		}
		
		TELOG.info("["+ request.getRequestURI()+"] <<");
		
		testService.test();
		
		List<Object> empList = testService.empList();
		
		
		model.addAttribute("empList", empList);
		TELOG.info("[empList] " + empList);
		return "emp/empList";
	}
	
}
