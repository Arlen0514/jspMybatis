package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class TestController {
	@RequestMapping("exam1")
	public ModelAndView gotoExam1()
	{
        ModelAndView mav=new ModelAndView("exam1");//去Application找路徑/WEB=INF/jsp/
		return mav;
		
	}

}
