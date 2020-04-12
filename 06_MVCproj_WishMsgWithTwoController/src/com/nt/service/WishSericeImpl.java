package com.nt.service;

import java.util.Calendar;

public class WishSericeImpl implements WishService {

	@Override
	public String generateWishMsg() {
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
		return msg;
	}

}
