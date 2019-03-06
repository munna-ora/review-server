package com.orastays.reviewserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.orastays.reviewserver.helper.MessageUtil;
import com.orastays.reviewserver.service.ReviewService;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected ReviewService reviewService;
	
	@Autowired
	protected MessageUtil messageUtil;
}
