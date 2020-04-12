package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class DisplayWishMsgController extends AbstractController {

	private WishService service;
	
	
	public DisplayWishMsgController(WishService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// use service
		
		String msg=null;
		msg=service.generateWishMsg();

		return new ModelAndView("result","resMsg",msg);
	}

}
