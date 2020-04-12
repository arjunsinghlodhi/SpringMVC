package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class DisplayWishMsgController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// write b.logic
		Calendar calendar = Calendar.getInstance();
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12)
			msg="Goooood Morning";
		else if(hour<16)
			msg="Goooood Ofternoon";
		else if(hour<20)
			msg="Goooood Evening";
		else
			msg="Goooood Night";

		return new ModelAndView("result","resMsg",msg);
	}

}
