package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("ex2")
	public String gotoExam1()
	{
		//ModelAndView mav=new ModelAndView("exam1");//WEB-INF/jsp
		
		return "ex2";
	}

}