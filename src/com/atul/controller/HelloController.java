package com.atul.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelView = new ModelAndView("HelloPage");
		modelView.addObject("welcomeMessage","Hi Welcome to the first Spring Web application");
		return modelView;
	}

}
